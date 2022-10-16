package source.local

import datasource.ParticipantDataSource
import model.Participant
import model.Person
import java.util.Calendar

class ParticipantLocalSource : ParticipantDataSource {
    override fun getParticipant(calendar: Calendar): List<Participant>? {
        return when (calendar.get(Calendar.YEAR)) {
            2021 -> participantTwentyTwentyOne()
            else -> null
        }
    }

    private fun participantTwentyTwentyOne(): List<Participant> = arrayListOf<Participant>().apply {
        addAll(superGifterList())
        addAll(gifterParticipantList())
        addAll(simpleParticipantList())
    }

    private fun superGifterList() = arrayListOf(
        superGifterParticipant(Person.MAMI_JOSEPHINE_SCHILTZ),
        superGifterParticipant(Person.FRANCIS_MUKENDI),
        superGifterParticipant(Person.ANNE_PAPA),
        superGifterParticipant(Person.ABDOU_PAPA),
        superGifterParticipant(Person.ISMAEL_PAPA),
        superGifterParticipant(Person.KASSAI_MUKENDI),
        superGifterParticipant(Person.MONIQUE_MUKENDI),
        superGifterParticipant(Person.JC_MBAPPE),
        superGifterParticipant(Person.WILLY_MBAPPE),
        superGifterParticipant(Person.ABED_KRADCHI),
        superGifterParticipant(Person.JOELLE_KRADCHI),
        superGifterParticipant(Person.FRANCO_KABUELA),
        superGifterParticipant(Person.THIERRY_SAPO_TCHABA),
        superGifterParticipant(Person.GERY_SAPO_TCHABA),
        superGifterParticipant(Person.GREGORY_SAPO_TCHABA),
        superGifterParticipant(Person.DIDIER_SIMBA),
        superGifterParticipant(Person.LISIANE_SIMBA),
        superGifterParticipant(Person.MURIELLE_SCHILTZ)
    )

    private fun gifterParticipantList() = arrayListOf(
        gifterParticipant(Person.NANCY_MUKENDI),
        gifterParticipant(Person.RWANN_MUKENDI),
        gifterParticipant(Person.KONY_MUKENDI),
        gifterParticipant(Person.MAMI_MONIQUE_MUKENDI),
        gifterParticipant(Person.BRIGITTE_KABUELA),
        gifterParticipant(Person.DENIS_MBIYA),
        gifterParticipant(Person.GUY_MBIYA),
        gifterParticipant(Person.YANNICK_MBIYA),
        gifterParticipant(Person.PATRICIA_MBIYA),
        gifterParticipant(Person.SARAH_BERTHIER),
        gifterParticipant(Person.ELSA_MADENSPACHER)
    )

    private fun simpleParticipantList() = arrayListOf(
        simpleParticipant(Person.KASSAI_MUKENDI),
        simpleParticipant(Person.JIBRIL_KRADCHI),
        simpleParticipant(Person.YOWA_MUKENDI),
        simpleParticipant(Person.YANIS_KRADCHI),
        simpleParticipant(Person.JEREMY_KABUELA),
        simpleParticipant(Person.RICHIE_KABUELA),
        simpleParticipant(Person.YOHAN_KABUELA),
        simpleParticipant(Person.JAYDEN_MBIYA),
        simpleParticipant(Person.JASON_MBIYA),
        simpleParticipant(Person.MIA_SAPO_TCHABA),
        simpleParticipant(Person.ELA_SAPO_TCHABA),
        simpleParticipant(Person.BAHIYA_PAPA),
        simpleParticipant(Person.RAISSA_PAPA),
        simpleParticipant(Person.GARRET_SENE),
        simpleParticipant(Person.HELENE_MBAPPE),
        simpleParticipant(Person.YELENA_SCHILTZ),
        simpleParticipant(Person.NELSON_SCHILTZ),
        simpleParticipant(Person.LUIGIE_SIMBA)
    )
    private fun simpleParticipant(person: Person) = Participant(person)

    private fun gifterParticipant(person: Person) = Participant(person, canOffer = true)

    private fun superGifterParticipant(person: Person) = Participant(person, canOffer = true, canMultiOffer = true)
}
