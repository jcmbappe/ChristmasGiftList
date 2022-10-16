import model.Participant
import model.Person
import model.SantaList
import model.SecretSanta
import repository.ParticipantRepository
import source.local.SantaLocalSource
import java.util.Calendar
import java.util.Calendar.YEAR

fun main(args: Array<String>) {
    val calendar = Calendar.getInstance().apply {
        set(Calendar.YEAR, 2021)
    }
    val list = ParticipantRepository().getParticipant(calendar)

    val santaList = arrayListOf<SecretSanta>().apply {
        list?.secretSanta(Person.MAMI_JOSEPHINE_SCHILTZ, Person.SARAH_BERTHIER)?.let(::add)
        list?.secretSanta(Person.MAMI_JOSEPHINE_SCHILTZ, Person.LISIANE_SIMBA)?.let(::add)
        list?.secretSanta(Person.FRANCIS_MUKENDI, Person.BAHIYA_PAPA)?.let(::add)
        list?.secretSanta(Person.ANNE_PAPA, Person.YANIS_KRADCHI)?.let(::add)
        list?.secretSanta(Person.ANNE_PAPA, Person.GERY_SAPO_TCHABA)?.let(::add)
        list?.secretSanta(Person.ABDOU_PAPA, Person.RICHIE_KABUELA)?.let(::add)
        list?.secretSanta(Person.ABDOU_PAPA, Person.CHRISTOPHER_SIMBA)?.let(::add)
        list?.secretSanta(Person.ISMAEL_PAPA, Person.FRANCIS_MUKENDI)?.let(::add)
        list?.secretSanta(Person.ISMAEL_PAPA, Person.MAMI_JOSEPHINE_SCHILTZ)?.let(::add)
        list?.secretSanta(Person.KASSIM_PAPA, Person.JEREMY_KABUELA)?.let(::add)
        list?.secretSanta(Person.KASSIM_PAPA, Person.JC_MBAPPE)?.let(::add)
        list?.secretSanta(Person.MONIQUE_MUKENDI, Person.YOWA_MUKENDI)?.let(::add)
        list?.secretSanta(Person.MONIQUE_MUKENDI, Person.RWANN_MUKENDI)?.let(::add)
        list?.secretSanta(Person.CAMILLE_GARCIA, Person.KASSAI_MUKENDI)?.let(::add)
        list?.secretSanta(Person.JC_MBAPPE, Person.YOHAN_KABUELA)?.let(::add)
        list?.secretSanta(Person.WILLY_MBAPPE, Person.RAISSA_PAPA)?.let(::add)
        list?.secretSanta(Person.WILLY_MBAPPE, Person.BRIGITTE_KABUELA)?.let(::add)
        list?.secretSanta(Person.ABED_KRADCHI, Person.ANNE_PAPA)?.let(::add)
        list?.secretSanta(Person.ABED_KRADCHI, Person.ELSA_MADENSPACHER)?.let(::add)
        list?.secretSanta(Person.JOELLE_KRADCHI, Person.DIDIER_SIMBA)?.let(::add)
        list?.secretSanta(Person.JOELLE_KRADCHI, Person.ABDOU_PAPA)?.let(::add)
        list?.secretSanta(Person.THIERRY_SAPO_TCHABA, Person.WILLY_MBAPPE)?.let(::add)
        list?.secretSanta(Person.THIERRY_SAPO_TCHABA, Person.LUIGIE_SIMBA)?.let(::add)
        list?.secretSanta(Person.GREGORY_SAPO_TCHABA, Person.JIBRIL_KRADCHI)?.let(::add)
        list?.secretSanta(Person.GREGORY_SAPO_TCHABA, Person.ABED_KRADCHI)?.let(::add)
        list?.secretSanta(Person.GERY_SAPO_TCHABA, Person.KASSIM_PAPA)?.let(::add)
        list?.secretSanta(Person.GERY_SAPO_TCHABA, Person.YOWA_MUKENDI)?.let(::add)
        list?.secretSanta(Person.FRANCO_KABUELA, Person.HELENE_MBAPPE)?.let(::add)
        list?.secretSanta(Person.DIDIER_SIMBA, Person.MONIQUE_MUKENDI)?.let(::add)
        list?.secretSanta(Person.LISIANE_SIMBA, Person.ISMAEL_PAPA)?.let(::add)
        list?.secretSanta(Person.NANCY_MUKENDI, Person.THIERRY_SAPO_TCHABA)?.let(::add)
        list?.secretSanta(Person.RWANN_MUKENDI, Person.ELA_SAPO_TCHABA)?.let(::add)
        list?.secretSanta(Person.KONY_MUKENDI, Person.LUDIVINE_ARNOUX)?.let(::add)
        list?.secretSanta(Person.MAMI_MONIQUE_MUKENDI, Person.CAMILLE_GARCIA)?.let(::add)
        list?.secretSanta(Person.BRIGITTE_KABUELA, Person.KONY_MUKENDI)?.let(::add)
        list?.secretSanta(Person.JEREMY_KABUELA, Person.GREGORY_SAPO_TCHABA)?.let(::add)
        list?.secretSanta(Person.GUY_MBIYA, Person.MIA_SAPO_TCHABA)?.let(::add)
        list?.secretSanta(Person.GARRET_SENE, Person.FRANCO_KABUELA)?.let(::add)
        list?.secretSanta(Person.SARAH_BERTHIER, Person.GUY_MBIYA)?.let(::add)
        list?.secretSanta(Person.ELA_SAPO_TCHABA, Person.NANCY_MUKENDI)?.let(::add)
        list?.secretSanta(Person.LUDIVINE_ARNOUX, Person.MAMI_MONIQUE_MUKENDI)?.let(::add)
        list?.secretSanta(Person.RICHIE_KABUELA, Person.GARRET_SENE)?.let(::add)
    }

    println(santaList)
    SantaLocalSource().saveSantaList(calendar, santaList = SantaList(calendar.get(YEAR), santaList.toList()))
}

private fun List<Participant>.secretSanta(santa: Person, receiver: Person) = SecretSanta(
    santa = find { it.person == santa } ?: Participant(santa, true),
    receiver = find { it.person == receiver } ?: Participant(receiver, true)
)