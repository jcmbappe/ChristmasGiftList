package source.local

import datasource.SantaDataSource
import model.SantaList
import java.util.*

class SantaLocalSource : SantaDataSource {
    override fun getSantaList(calendar: Calendar): List<SantaList> {
        TODO("Not yet implemented")
    }

    override fun saveSantaList(santaList: List<SantaList>) {
        TODO("Not yet implemented")
    }
}