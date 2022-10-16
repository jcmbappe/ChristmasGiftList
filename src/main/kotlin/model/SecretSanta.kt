package model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SecretSanta(
    val santa: Person,
    val receiver: Person
)
