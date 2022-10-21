package model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChristmasList(
    val year: Int,
    val list: List<SecretSanta>
) : List<SecretSanta> by list
