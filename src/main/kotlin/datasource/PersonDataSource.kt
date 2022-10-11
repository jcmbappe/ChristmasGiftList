package datasource

import model.Person

interface PersonDataSource {
    fun getPersonList() : List<Person>
}