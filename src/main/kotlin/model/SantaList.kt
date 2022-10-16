package model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SantaList(
    val year: Int,
    val list: List<SecretSanta>
)
