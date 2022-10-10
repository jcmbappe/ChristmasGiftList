package generator

import model.Person
import java.util.UUID

fun main(args: Array<String>) {
    generate("Doe")
    generate("Bar")
}

private fun generate(name: String) {
    println("${Person::class.java.simpleName}(id = \"${UUID.randomUUID()}\", firstname = \"$name\",  families = listOf()),")
}