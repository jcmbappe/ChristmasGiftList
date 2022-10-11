package model

data class Participant(
    val person: Person,
    val canOffer : Boolean,
    val canMultiOffer: Boolean
)
