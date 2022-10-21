package source.local

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import datasource.SantaDataSource
import model.ChristmasList
import repository.ParticipantRepository
import java.io.File

class SantaLocalSource : SantaDataSource {

    override fun getChristmasList(year: Int): ChristmasList? {
        val jsonAdapter: JsonAdapter<ChristmasList> = Moshi.Builder()
            .build()
            .adapter(ChristmasList::class.java)

        return try {
            val content = File(getFileName(year)).readText()
            jsonAdapter.fromJson(content)
        } catch (e: Exception) {
            println(e.message)
            null
        }
    }

    override fun saveChristmasList(year: Int, christmasList: ChristmasList) {
        val jsonAdapter: JsonAdapter<ChristmasList> = Moshi.Builder()
            .build()
            .adapter(ChristmasList::class.java)

        try {
            File(getFileName(year)).apply {
                createNewFile()
                writeText(jsonAdapter.toJson(christmasList))
            }
        } catch (e: NullPointerException) {
            println(e.message)
        }
    }

    private fun getFileName(year: Int) = PATH + "SecretSanta${year}.json"

    companion object {
        private const val PATH: String = "src/main/resources/json/"
    }
}