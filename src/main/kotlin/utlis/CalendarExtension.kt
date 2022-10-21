package utlis

import java.util.*
import java.util.Calendar.YEAR

val Calendar.year: Int
    get() = get(YEAR)
