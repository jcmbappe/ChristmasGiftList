package datasource

import model.Participant
import java.time.Year
import java.util.Calendar

interface ParticipantDataSource {
    fun getParticipant(year: Int) : List<Participant>?
}