package repository

import datasource.ParticipantDataSource
import source.local.ParticipantLocalSource

class ParticipantRepository(source: ParticipantDataSource = ParticipantLocalSource()) : ParticipantDataSource by source
