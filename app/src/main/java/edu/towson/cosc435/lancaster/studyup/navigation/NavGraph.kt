package edu.towson.cosc435.lancaster.studyup.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.towson.cosc435.lancaster.studyup.screens.addUser.addStudentScreen
import edu.towson.cosc435.lancaster.studyup.screens.addUser.addTutorScreen
import edu.towson.cosc435.lancaster.studyup.screens.appointment.*
import edu.towson.cosc435.lancaster.studyup.screens.assignment.*
import edu.towson.cosc435.lancaster.studyup.screens.detail.DetailScreen
import edu.towson.cosc435.lancaster.studyup.screens.home.HomeScreen
import edu.towson.cosc435.lancaster.studyup.screens.home.studentHomeScreen
import edu.towson.cosc435.lancaster.studyup.screens.login.LoginScreen
import edu.towson.cosc435.lancaster.studyup.screens.login.LoginTwo
import edu.towson.cosc435.lancaster.studyup.screens.login.studentLoginTwo
import edu.towson.cosc435.lancaster.studyup.screens.readingmaterials.ReadingMatScreen
import edu.towson.cosc435.lancaster.studyup.screens.readingmaterials.studentReadingMatScreen
import edu.towson.cosc435.lancaster.studyup.screens.reminders.ReminderScreen

@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.Login.route)
    {


        //TODO login, home, studenthome, (drawer) Details, (drawer) studentDetails


        composable(route = Screens.Login.route){
            LoginScreen(navController)
        }

        composable(route = Screens.LoginTwo.route){
            LoginTwo(navController)
        }
        composable(route = Screens.studentLoginTwo.route){
            studentLoginTwo(navController)
        }

        composable(route = Screens.Home.route){
            HomeScreen(navController)
        }
        composable(route = Screens.studentHome.route){
            studentHomeScreen(navController)
        }

        composable(route = Screens.Assignment.route){
            AssignmentScreen(navController)
        }
        composable(route = Screens.studentAssignment.route){
            studentAssignmentScreen(navController)
        }

        composable(route = Screens.Appointment.route){
            AppointmentScreen(navController)
        }
        composable(route = Screens.studentAppointmentScreen.route){
            studentAppointmentScreen(navController)
        }

        composable(route = Screens.Detail.route){
            DetailScreen()
        }

        composable(route = Screens.ReadingMatScreen.route){
            ReadingMatScreen(navController)
        }

        composable(route = Screens.studentReadingMatScreen.route){
            studentReadingMatScreen(navController)
        }

        composable(route = Screens.ReminderScreen.route){
            ReminderScreen(navController)
        }

        composable(route = Screens.addTutorScreen.route){
            addTutorScreen(navController)
        }

        composable(route = Screens.addStudentScreen.route){
            addStudentScreen(navController)
        }

        composable(route = Screens.assignAssignments.route){
            assignAssignmentScreen(navController)
        }
        composable(route = Screens.studentUploadAssignments.route){
            studentUploadAssignment(navController)
        }
        composable(route = Screens.viewAssignments.route){
            viewAssignmentScreen(navController)
        }

        composable(route = Screens.viewAppointments.route){
            viewAppointmentScreen(navController)
        }
        composable(route = Screens.appointmentRequests.route){
            appointmentRequestScreen(navController)
        }
        composable(route = Screens.createAppointments.route){
            createAppointmentScreen(navController)
        }
        composable(route = Screens.loginScreen.route){
            LoginScreen(navController)
        }
    }
}
