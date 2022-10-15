package datasource

import model.SantaList
import java.util.Calendar

interface SantaDataSource {
    fun getSantaList(calendar: Calendar): SantaList?
    fun saveSantaList(calendar: Calendar, santaList: SantaList)
}