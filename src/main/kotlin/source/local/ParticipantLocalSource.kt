package source.local

import datasource.ParticipantDataSource
import model.Participant
import java.util.Calendar

class ParticipantLocalSource : ParticipantDataSource {
    override fun getParticipant(calendar: Calendar): List<Participant>? {
        return when (calendar.get(Calendar.YEAR)) {
            2021 -> emptyList()
            else -> null
        }
    }
}
