package timetable

import kotlinx.serialization.Serializable

@Serializable
data class Timetable(
    val week: Int,
    private val lectures: List<Lecture>
) {
    fun getLectures(): List<Lecture> = lectures
}