package repository

import datasource.PersonDatasource
import model.Family
import model.Person

object PersonLocalRepository : PersonDatasource {
    override fun getPersonList(): List<Person> = mutableListOf<Person>().apply {
        addAll(mukendiFamilyList())
        addAll(papaFamilyList())
        addAll(mbappeFamilyList())
        addAll(kradchiFamilyList())
        addAll(papaFritzFamily())
        addAll(kabuelaFamily())
        addAll(sapoTchabaBerthierFamily())
        addAll(sapoTchabaMadenspacherFamily())
        addAll(sapoTchabaArnouxFamily())
        addAll(simbaFamily())
        addAll(schiltzKpFamily())
        addAll(schiltzMurielleFamily())
        addAll(schiltzThomasFamily())
        addAll(mbiyaFamily())
    }

    private fun mukendiFamilyList() = listOf(
        Person(firstname = "Francis", families = listOf(Family.MUKENDI)),
        Person(firstname = "Rwann", families = listOf(Family.MUKENDI)),
        Person(firstname = "Kony", families = listOf(Family.MUKENDI)),
        Person(firstname = "Kassaï", families = listOf(Family.MUKENDI)),
        Person(firstname = "Yowa", families = listOf(Family.MUKENDI))
    )

    private fun papaFamilyList() = listOf(
        Person(firstname = "Adbou", families = listOf(Family.PAPA)),
        Person(firstname = "Anna", families = listOf(Family.PAPA)),
        Person(firstname = "Kassim", families = listOf(Family.PAPA)),
        Person(firstname = "Bahiya", families = listOf(Family.PAPA)),
        Person(firstname = "Raïssa", families = listOf(Family.PAPA))
    )

    private fun mbappeFamilyList() = listOf(
        Person(firstname = "Monique", families = listOf(Family.MBAPPE)),
        Person(firstname = "Jc", families = listOf(Family.MBAPPE)),
        Person(firstname = "Willy", families = listOf(Family.MBAPPE)),
        Person(firstname = "Hélène", families = listOf(Family.MBAPPE))
    )

    private fun kradchiFamilyList() = listOf(
        Person(firstname = "Abed", families = listOf(Family.KRADCHI)),
        Person(firstname = "Joelle", families = listOf(Family.KRADCHI)),
        Person(firstname = "Jibril", families = listOf(Family.KRADCHI)),
        Person(firstname = "Yanis", families = listOf(Family.KRADCHI))
    )

    private fun papaFritzFamily() = listOf(
        Person(firstname = "Ismael", families = listOf(Family.PAPA, Family.PAPA_FRITZ)),
        Person(firstname = "Pritanya", families = listOf(Family.FRITZ, Family.PAPA_FRITZ))
    )

    private fun kabuelaFamily() = listOf(
        Person(firstname = "Franco", families = listOf(Family.KABUELA)),
        Person(firstname = "Brigitte", families = listOf(Family.KABUELA)),
        Person(firstname = "Jeremy", families = listOf(Family.KABUELA)),
        Person(firstname = "Richie", families = listOf(Family.KABUELA)),
        Person(firstname = "Yohan", families = listOf(Family.KABUELA))
    )

    private fun sapoTchabaBerthierFamily() = listOf(
        Person(firstname = "Thierry", families = listOf(Family.SAPO_TCHABA, Family.SAPO_TCHABA_BERTHIER)),
        Person(firstname = "Sarah", families = listOf(Family.BERTHIER, Family.SAPO_TCHABA_BERTHIER)),
        Person(firstname = "Ela", families = listOf(Family.SAPO_TCHABA_BERTHIER)),
        Person(firstname = "Mia", families = listOf(Family.SAPO_TCHABA_BERTHIER)),
    )

    private fun sapoTchabaMadenspacherFamily() = listOf(
        Person(firstname = "Gregory", families = listOf(Family.SAPO_TCHABA, Family.SAPO_TCHABA_MADENSPACHER)),
        Person(firstname = "Elsa", families = listOf(Family.MADENSPACHER, Family.SAPO_TCHABA_MADENSPACHER))
    )

    private fun sapoTchabaArnouxFamily() = listOf(
        Person(firstname = "Gregory", families = listOf(Family.SAPO_TCHABA, Family.SAPO_TCHABA_ARNOUX)),
        Person(firstname = "Ludivine", families = listOf(Family.ARNOUX, Family.SAPO_TCHABA_ARNOUX))
    )

    private fun simbaFamily() = listOf(
        Person(firstname = "Didier", families = listOf(Family.SIMBA)),
        Person(firstname = "Lise", families = listOf(Family.SIMBA)),
        Person(firstname = "Christopher", families = listOf(Family.SIMBA))
    )

    private fun schiltzKpFamily() = listOf(
        Person(firstname = "Loïc", families = listOf(Family.SCHILTZ_KP))
    )

    private fun schiltzMurielleFamily() = listOf(
        Person(firstname = "Murielle", families = listOf(Family.SCHILTZ_MURIELLE)),
        Person(firstname = "Yelena", families = listOf(Family.SCHILTZ_MURIELLE)),
        Person(firstname = "Nelson", families = listOf(Family.SCHILTZ_MURIELLE))
    )

    private fun schiltzThomasFamily() = listOf(
        Person(firstname = "Francine", families = listOf(Family.SCHILTZ_THOMAS)),
        Person(firstname = "Alexis", families = listOf(Family.SCHILTZ_THOMAS)),
        Person(firstname = "Jeremy", families = listOf(Family.SCHILTZ_THOMAS))
    )

    private fun mbiyaFamily() = listOf(
        Person(firstname = "Denis", families = listOf(Family.MBIYA)),
        Person(firstname = "Guy", families = listOf(Family.MBIYA))
    )
}