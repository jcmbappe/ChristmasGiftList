package viewModel

import model.*
import repository.ParticipantRepository
import repository.SantaRepository
import java.util.*

class MainViewModel(
    private val participantRepository: ParticipantRepository = ParticipantRepository(),
    private val santaRepository: SantaRepository = SantaRepository()
) {
    private var previousChristmasList: ChristmasList? = null

    fun generateList(year: Int): List<SecretSanta> {
        previousChristmasList = santaRepository.getChristmasList(year - 1)

        val participants = participantRepository.getParticipant(year)
            ?: throw NullPointerException("No participant list for year $year")

        verifyDataRules(participants)

        val santaList = getSantaList(participants)
        val secretSantaList: MutableList<SecretSanta> = mutableListOf()

        assignSecretSanta(participants.map { it.person }, santaList, secretSantaList)
        santaRepository.saveChristmasList(year, ChristmasList(year, secretSantaList))

        return secretSantaList
    }

    private fun assignSecretSanta(
        participants: List<Person>,
        santaList: SantaList,
        secretSantaList: MutableList<SecretSanta>
    ): Boolean {
        for (index in secretSantaList.size until participants.size) {
            val santa = santaList.pop()

            val secretSanta = SecretSanta(santa = santa, receiver = participants[index])
            secretSantaList.add(secretSanta)

            if (isSantaValid(participants[index], santa)) {
                return if (assignSecretSanta(participants, santaList, secretSantaList)) {
                    true
                } else {
                    santaList.addLast(santa)
                    secretSantaList.remove(secretSanta)
                    false
                }

            } else {
                santaList.addLast(santa)
                secretSantaList.remove(secretSanta)
            }
        }

        return true
    }

    private fun isSantaValid(receiver: Person, santa: Person): Boolean {
        val previousYear = previousChristmasList?.find { it.receiver == receiver }

        if (receiver == santa) return false
        if (previousYear?.santa == santa) return false
        receiver.families.forEach { receiverFamily ->
            if (santa.families.contains(receiverFamily)) return false
        }

        return true
    }

    private fun getSantaList(participants: List<Participant>): SantaList {
        val santa = participants.filter { it.canOffer }.shuffled().toMutableList()
        val superSanta = participants.filter { it.canMultiOffer }.toMutableList()


        while (santa.size + superSanta.size <= participants.size) {
            participants.filter { it.canMultiOffer }.toMutableList().forEach {
                superSanta.add(it)
                if (santa.size + superSanta.size >= participants.size) return@forEach
            }
        }

        return SantaList(
            santaList = ArrayDeque(santa.map { it.person }),
            superSantaList = ArrayDeque(superSanta.map { it.person })
        )
    }

    private fun verifyDataRules(participants: List<Participant>) {
//        val santaCount = participants.count { it.canOffer } + participants.count { it.canMultiOffer }

        if (participants.none { it.canOffer }) throw Exception("No participant who can offer for this year")
//        if (santaCount < participants.size) throw Exception("Not enough santa for the number of participants")
    }
}

