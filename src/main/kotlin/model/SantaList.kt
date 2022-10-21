package model

import java.util.*

data class SantaList(
    private val santaList: ArrayDeque<Person>,
    private val superSantaList: ArrayDeque<Person>
) {

    fun pop(): Person {
        val person = santaList.pop()
        if (santaList.peek() == null) {
            santaList.addAll(superSantaList)
        }

        return person
    }

    fun addLast(person: Person) {
        santaList.addLast(person)
    }
}