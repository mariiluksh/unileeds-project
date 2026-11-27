package timetable

import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalTime

fun sampleStudent(): Student {
    val lectures = listOf(
        Lecture(
            "COMP2850",
            "Software Engineering",
            DayOfWeek.MONDAY,
            LocalTime(9, 0),
            "Bragg Teaching Lab (2.05)"
        ),
        Lecture(
            "COMP28670",
            "Theoretical Foundations",
            DayOfWeek.TUESDAY,
            LocalTime(12, 0),
            "Chemistry LT A (2.15)"
        ),
        Lecture(
            "COMP2860",
            "Operating Systems",
            DayOfWeek.WEDNESDAY,
            LocalTime(10, 0),
            "Mechanical Engineering LT A (1.33)"
        ),
        Lecture(
            "COMP Skills",
            "Interview Skills",
            DayOfWeek.THURSDAY,
            LocalTime(14, 0),
            "William Bragg SR (GR.18)"
        )
    )

    val timetable = Timetable(1, lectures)

    return Student(
        201711789,
        "Polina Guhman",
        "MEng Computer Science (Artificial Intelligence)",
        timetable
    )
}