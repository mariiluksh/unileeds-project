package timetable

import kotlinx.datetime.DayOfWeek
import kotlin.test.Test
import kotlin.test.assertEquals

class TimetableTest {
    @Test
    fun `Student has the sample timetable`() {
        val student = sampleStudent()

        assertEquals(201711789, student.studentId)
        assertEquals("Polina Guhman", student.name)
        assertEquals("MEng Computer Science (Artificial Intelligence)", student.course)
        assertEquals(1, student.timetable.week)
    }

    @Test
    fun `Timetable returns all lectures`() {
        val lectures = sampleStudent().timetable.getLectures()

        assertEquals(4, lectures.size)
        assertEquals("COMP2850", lectures[0].moduleCode)
        assertEquals("Software Engineering", lectures[0].title)
        assertEquals(DayOfWeek.MONDAY, lectures[0].day)
        assertEquals("Bragg Teaching Lab (2.05)", lectures[0].room)
    }

    @Test
    fun `Lectures stored are ordered by day of week`() {
        val lectures = sampleStudent().timetable.getLectures()

        assertEquals(DayOfWeek.MONDAY, lectures[0].day)
        assertEquals(DayOfWeek.TUESDAY, lectures[1].day)
        assertEquals(DayOfWeek.WEDNESDAY, lectures[2].day)
        assertEquals(DayOfWeek.THURSDAY, lectures[3].day)
    }
}