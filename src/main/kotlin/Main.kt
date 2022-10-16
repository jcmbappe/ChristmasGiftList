import model.Person
import model.SantaList
import model.SecretSanta
import repository.SantaRepository
import java.util.Calendar
import java.util.Calendar.YEAR

fun main(args: Array<String>) {
    val calendar = Calendar.getInstance().apply {
        set(Calendar.YEAR, 2021)
    }

    val santaList = arrayListOf<SecretSanta>().apply {
        add(SecretSanta(Person.MAMI_JOSEPHINE_SCHILTZ, Person.SARAH_BERTHIER))
        add(SecretSanta(Person.MAMI_JOSEPHINE_SCHILTZ, Person.LISIANE_SIMBA))
        add(SecretSanta(Person.FRANCIS_MUKENDI, Person.BAHIYA_PAPA))
        add(SecretSanta(Person.ANNE_PAPA, Person.YANIS_KRADCHI))
        add(SecretSanta(Person.ANNE_PAPA, Person.GERY_SAPO_TCHABA))
        add(SecretSanta(Person.ABDOU_PAPA, Person.RICHIE_KABUELA))
        add(SecretSanta(Person.ABDOU_PAPA, Person.CHRISTOPHER_SIMBA))
        add(SecretSanta(Person.ISMAEL_PAPA, Person.FRANCIS_MUKENDI))
        add(SecretSanta(Person.ISMAEL_PAPA, Person.MAMI_JOSEPHINE_SCHILTZ))
        add(SecretSanta(Person.KASSIM_PAPA, Person.JEREMY_KABUELA))
        add(SecretSanta(Person.KASSIM_PAPA, Person.JC_MBAPPE))
        add(SecretSanta(Person.MONIQUE_MUKENDI, Person.YOWA_MUKENDI))
        add(SecretSanta(Person.MONIQUE_MUKENDI, Person.RWANN_MUKENDI))
        add(SecretSanta(Person.CAMILLE_GARCIA, Person.KASSAI_MUKENDI))
        add(SecretSanta(Person.JC_MBAPPE, Person.YOHAN_KABUELA))
        add(SecretSanta(Person.WILLY_MBAPPE, Person.RAISSA_PAPA))
        add(SecretSanta(Person.WILLY_MBAPPE, Person.BRIGITTE_KABUELA))
        add(SecretSanta(Person.ABED_KRADCHI, Person.ANNE_PAPA))
        add(SecretSanta(Person.ABED_KRADCHI, Person.ELSA_MADENSPACHER))
        add(SecretSanta(Person.JOELLE_KRADCHI, Person.DIDIER_SIMBA))
        add(SecretSanta(Person.JOELLE_KRADCHI, Person.ABDOU_PAPA))
        add(SecretSanta(Person.THIERRY_SAPO_TCHABA, Person.WILLY_MBAPPE))
        add(SecretSanta(Person.THIERRY_SAPO_TCHABA, Person.LUIGIE_SIMBA))
        add(SecretSanta(Person.GREGORY_SAPO_TCHABA, Person.JIBRIL_KRADCHI))
        add(SecretSanta(Person.GREGORY_SAPO_TCHABA, Person.ABED_KRADCHI))
        add(SecretSanta(Person.GERY_SAPO_TCHABA, Person.KASSIM_PAPA))
        add(SecretSanta(Person.GERY_SAPO_TCHABA, Person.YOWA_MUKENDI))
        add(SecretSanta(Person.FRANCO_KABUELA, Person.HELENE_MBAPPE))
        add(SecretSanta(Person.DIDIER_SIMBA, Person.MONIQUE_MUKENDI))
        add(SecretSanta(Person.LISIANE_SIMBA, Person.ISMAEL_PAPA))
        add(SecretSanta(Person.NANCY_MUKENDI, Person.THIERRY_SAPO_TCHABA))
        add(SecretSanta(Person.RWANN_MUKENDI, Person.ELA_SAPO_TCHABA))
        add(SecretSanta(Person.KONY_MUKENDI, Person.LUDIVINE_ARNOUX))
        add(SecretSanta(Person.MAMI_MONIQUE_MUKENDI, Person.CAMILLE_GARCIA))
        add(SecretSanta(Person.BRIGITTE_KABUELA, Person.KONY_MUKENDI))
        add(SecretSanta(Person.JEREMY_KABUELA, Person.GREGORY_SAPO_TCHABA))
        add(SecretSanta(Person.GUY_MBIYA, Person.MIA_SAPO_TCHABA))
        add(SecretSanta(Person.GARRET_SENE, Person.FRANCO_KABUELA))
        add(SecretSanta(Person.SARAH_BERTHIER, Person.GUY_MBIYA))
        add(SecretSanta(Person.ELSA_MADENSPACHER, Person.NANCY_MUKENDI))
        add(SecretSanta(Person.LUDIVINE_ARNOUX, Person.MAMI_MONIQUE_MUKENDI))
        add(SecretSanta(Person.RICHIE_KABUELA, Person.GARRET_SENE))
    }

    println(santaList)
    SantaRepository().saveSantaList(calendar, santaList = SantaList(calendar.get(YEAR), santaList.toList()))
}
