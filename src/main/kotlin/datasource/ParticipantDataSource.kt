package datasource

import model.Participant
import java.util.Calendar

interface ParticipantDataSource {
    fun getParticipant(calendar: Calendar) : List<Participant>?
}