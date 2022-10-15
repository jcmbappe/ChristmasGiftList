package source.local

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import datasource.SantaDataSource
import model.SantaList
import java.io.File
import java.util.Calendar
import java.util.Calendar.YEAR

class SantaLocalSource : SantaDataSource {

    override fun getSantaList(calendar: Calendar): SantaList? {
        val jsonAdapter: JsonAdapter<SantaList> = Moshi.Builder()
            .build()
            .adapter(SantaList::class.java)

        return try {
            val content = File(getFileName(calendar)).readText()
            jsonAdapter.fromJson(content)
        } catch (e: Exception) {
            println(e.message)
            null
        }
    }

    override fun saveSantaList(calendar: Calendar, santaList: SantaList) {
        val jsonAdapter: JsonAdapter<SantaList> = Moshi.Builder()
            .build()
            .adapter(SantaList::class.java)

        try {
            File(getFileName(calendar)).apply {
                createNewFile()
                writeText(jsonAdapter.toJson(santaList))
            }
        } catch (e: NullPointerException) {
            println(e.message)
        }
    }

    private fun getFileName(calendar: Calendar) = "$PATH${calendar.get(YEAR)}.json"

    companion object {
        private const val PATH: String = "src/main/resources/json/"
    }
}