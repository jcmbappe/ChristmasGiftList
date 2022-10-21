package model

enum class Person(val families: List<Family>) {
    MAMI_JOSEPHINE_SCHILTZ(listOf(Family.SCHILTZ)),

    FRANCIS_MUKENDI(listOf(Family.MUKENDI)),
    NANCY_MUKENDI(listOf(Family.MUKENDI)),
    MAMI_MONIQUE_MUKENDI(listOf(Family.MUKENDI)),
    RWANN_MUKENDI(listOf(Family.MUKENDI)),
    KONY_MUKENDI(listOf(Family.MUKENDI)),
    KASSAI_MUKENDI(listOf(Family.MUKENDI)),
    YOWA_MUKENDI(listOf(Family.MUKENDI)),

    ABDOU_PAPA(listOf(Family.PAPA)),
    ANNE_PAPA(listOf(Family.PAPA)),
    KASSIM_PAPA(listOf(Family.PAPA)),
    BAHIYA_PAPA(listOf(Family.PAPA)),
    RAISSA_PAPA(listOf(Family.PAPA)),

    MONIQUE_MUKENDI(listOf(Family.MBAPPE)),
    WILLY_MBAPPE(listOf(Family.MBAPPE)),
    HELENE_MBAPPE(listOf(Family.MBAPPE)),

    JC_MBAPPE(listOf(Family.MBAPPE, Family.MBAPPE_GARCIA)),
    CAMILLE_GARCIA(listOf(Family.GARCIA, Family.MBAPPE_GARCIA)),

    ABED_KRADCHI(listOf(Family.KRADCHI)),
    JOELLE_KRADCHI(listOf(Family.KRADCHI)),
    JIBRIL_KRADCHI(listOf(Family.KRADCHI)),
    YANIS_KRADCHI(listOf(Family.KRADCHI)),

    ISMAEL_PAPA(listOf(Family.PAPA, Family.PAPA_FRITZ)),
    PRITANYA_FRITZ(listOf(Family.FRITZ, Family.PAPA_FRITZ)),

    FRANCO_KABUELA(listOf(Family.KABUELA)),
    BRIGITTE_KABUELA(listOf(Family.KABUELA)),
    JEREMY_KABUELA(listOf(Family.KABUELA)),
    RICHIE_KABUELA(listOf(Family.KABUELA)),
    YOHAN_KABUELA(listOf(Family.KABUELA)),

    THIERRY_SAPO_TCHABA(listOf(Family.SAPO_TCHABA, Family.SAPO_TCHABA_BERTHIER)),
    SARAH_BERTHIER(listOf(Family.BERTHIER, Family.SAPO_TCHABA_BERTHIER)),
    ELA_SAPO_TCHABA(listOf(Family.SAPO_TCHABA_BERTHIER)),
    MIA_SAPO_TCHABA(listOf(Family.SAPO_TCHABA_BERTHIER)),

    GREGORY_SAPO_TCHABA(listOf(Family.SAPO_TCHABA, Family.SAPO_TCHABA_MADENSPACHER)),
    ELSA_MADENSPACHER(listOf(Family.MADENSPACHER, Family.SAPO_TCHABA_MADENSPACHER)),

    GERY_SAPO_TCHABA(listOf(Family.SAPO_TCHABA, Family.SAPO_TCHABA_ARNOUX)),
    LUDIVINE_ARNOUX(listOf(Family.ARNOUX, Family.SAPO_TCHABA_ARNOUX)),

    DIDIER_SIMBA(listOf(Family.SIMBA)),
    LISIANE_SIMBA(listOf(Family.SIMBA)),
    CHRISTOPHER_SIMBA(listOf(Family.SIMBA)),
    LUIGIE_SIMBA(listOf(Family.SIMBA)),

    LOIC_SCHILTZ(listOf(Family.SCHILTZ_KP)),

    MURIELLE_SCHILTZ(listOf(Family.SCHILTZ_MURIELLE)),
    YELENA_SCHILTZ(listOf(Family.SCHILTZ_MURIELLE)),
    NELSON_SCHILTZ(listOf(Family.SCHILTZ_MURIELLE)),

    FRANCINE_SCHILTZ(listOf(Family.SCHILTZ_THOMAS)),
    ALEXIS_SCHILTZ(listOf(Family.SCHILTZ_THOMAS)),
    JEREMY_SCHILTZ(listOf(Family.SCHILTZ_THOMAS)),

    DENIS_MBIYA(listOf(Family.MBIYA)),
    GUY_MBIYA(listOf(Family.MBIYA)),
    YANNICK_MBIYA(listOf(Family.MBIYA)),
    PATRICIA_MBIYA(listOf(Family.MBIYA)),
    JAYDEN_MBIYA(listOf(Family.MBIYA)),
    JASON_MBIYA(listOf(Family.MBIYA)),

    GARRET_SENE(listOf(Family.SENE))
}
