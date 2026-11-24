package timetable

import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalTime
import kotlinx.serialization.Serializable

@Serializable
data class Lecture(
    val moduleCode: String,
    val title: String,
    val day: DayOfWeek,
    val start: LocalTime,
    val room: String
)