package datasource

import model.SantaList
import java.util.*

interface SantaDataSource {
    fun getSantaList(calendar: Calendar): List<SantaList>
    fun saveSantaList(santaList: List<SantaList>)
}