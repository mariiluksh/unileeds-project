package timetable

import kotlinx.serialization.Serializable

@Serializable
data class Student(
    val studentId: Int,
    val name: String,
    val course: String,
    val timetable: Timetable
)