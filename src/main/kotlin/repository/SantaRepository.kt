package repository

import datasource.SantaDataSource
import source.local.SantaLocalSource

class SantaRepository(source: SantaDataSource = SantaLocalSource()) : SantaDataSource by source
