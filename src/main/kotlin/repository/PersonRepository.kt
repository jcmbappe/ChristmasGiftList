package repository

import datasource.PersonDataSource
import source.local.PersonLocalSource

class PersonRepository(source: PersonDataSource = PersonLocalSource()) : PersonDataSource by source