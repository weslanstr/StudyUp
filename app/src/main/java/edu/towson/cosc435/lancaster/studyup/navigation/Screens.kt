package edu.towson.cosc435.lancaster.studyup.navigation

sealed class Screens(val route: String) {
    object Login: Screens("login_screen")

    object LoginTwo: Screens("login_screen_two")
    object studentLoginTwo: Screens("student_login_screen_two")

    object Home: Screens("home_screen")
    object studentHome : Screens("student_home_screen")

    object Detail: Screens("detail_screen")
    object studentDetail : Screens("student_detail_screen")

    object Assignment: Screens("assignment_screen")
    object studentAssignment: Screens("student_assignment_screen")

    object Appointment: Screens("appointments_screen")
    object studentAppointmentScreen: Screens("student_appointments_screen")

    object ReadingMat: Screens("student_readingmat_screen")
    object ReadingMatScreen: Screens("student_readingmat_screen")

    object studentReadingMat: Screens("readingmat_screen")
    object studentReadingMatScreen: Screens("student_readingmat_screen")

    object ReminderScreen: Screens("reminders_screen")

    object addStudentScreen: Screens("add_student_screen")
    object addTutorScreen: Screens("add_tutor_screen")

    object assignAssignments: Screens("assign_assignment_screen")
    object studentUploadAssignments: Screens("student_upload_assignment_screen")

    object viewAssignments: Screens("view_assignment_screen")

    object viewAppointments: Screens("view_appointment_screen")
    object appointmentRequests: Screens("appointments_request_screen")
    object createAppointments: Screens("create_appointment_screen")

    object loginScreen: Screens("login_screen")
}