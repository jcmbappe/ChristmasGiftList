package model

data class Person(
    val firstname : String,
    val families: List<Family>
) {
    val lastname: String
        get() {
            return families.firstOrNull()?.name
                ?: throw Exception("Person with firstname : $firstname don't have any families")
        }
}
