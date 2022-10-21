package datasource

import model.ChristmasList

interface SantaDataSource {

    fun getChristmasList(year: Int): ChristmasList?
    fun saveChristmasList(year: Int, christmasList: ChristmasList)
}