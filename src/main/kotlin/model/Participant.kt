package model

data class Participant(
    val person: Person,
    val canOffer : Boolean = false,
    val canMultiOffer: Boolean = false
)
