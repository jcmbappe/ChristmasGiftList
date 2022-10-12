package source.local

import datasource.PersonDataSource
import model.Person

class PersonLocalSource : PersonDataSource {
    override fun getPersonList(): List<Person> = Person.values().toList()

}