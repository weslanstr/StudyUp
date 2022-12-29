package edu.towson.cosc435.lancaster.studyup.screens.assignment

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.ui.graphics.Color
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun studentUploadAssignment(navController: NavController){
    var aName = remember { mutableStateOf("") }
    var aSubject = remember { mutableStateOf("") }
    var aDate = remember { mutableStateOf("") }

    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Name of the assignment: ", color = Color.Blue)
        OutlinedTextField(value = aName.value, onValueChange = {newValue: String -> aName.value = newValue}, Modifier.padding(15.dp))

        Text("Subject: ", color = Color.Blue)
        OutlinedTextField(value = aSubject.value, onValueChange = {newValue: String -> aSubject.value = newValue}, Modifier.padding(15.dp))

        Text("Due date: ", color = Color.Blue)
        OutlinedTextField(value = aDate.value, onValueChange = {newValue: String -> aDate.value = newValue}, Modifier.padding(15.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Attach file from phone")
        }

        Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(16.dp)) {
            Text(text = "Finish uploading assignment")
        }
    }
}