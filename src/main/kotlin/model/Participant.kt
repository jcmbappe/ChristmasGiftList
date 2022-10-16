package model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Participant(
    val person: Person,
    val canOffer : Boolean = false,
    val canMultiOffer: Boolean = false
)
