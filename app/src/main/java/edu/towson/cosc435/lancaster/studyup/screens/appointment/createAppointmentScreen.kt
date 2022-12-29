package edu.towson.cosc435.lancaster.studyup.screens.appointment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import edu.towson.cosc435.lancaster.studyup.navigation.Screens

@Composable
fun createAppointmentScreen(navController: NavController){
    var aDate = remember { mutableStateOf("") }
    var aTime = remember { mutableStateOf("") }
    var aPlace = remember { mutableStateOf("") }

    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Date of the appointment: ", color = Color.Blue)
        OutlinedTextField(value = aDate.value, onValueChange = {newValue: String -> aDate.value = newValue}, Modifier.padding(15.dp))

        Text("Time of the appointment: ", color = Color.Blue)
        OutlinedTextField(value = aTime.value, onValueChange = {newValue: String -> aTime.value = newValue}, Modifier.padding(15.dp))

        Text("Where: ", color = Color.Blue)
        OutlinedTextField(value = aPlace.value, onValueChange = {newValue: String -> aPlace.value = newValue}, Modifier.padding(15.dp))

        Button(onClick = { navController.navigate(Screens.studentHome.route) }, modifier = Modifier.padding(16.dp)) {
            Text(text = "Finish creating appointment")
        }
    }
}