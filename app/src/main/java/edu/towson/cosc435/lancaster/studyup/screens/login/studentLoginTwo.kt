package edu.towson.cosc435.lancaster.studyup.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import edu.towson.cosc435.lancaster.studyup.navigation.Screens

@Composable
fun studentLoginTwo(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {
            //TODO: Navigate to Home Screen
            navController.navigate(Screens.addTutorScreen.route)
        }) {
            Text("Sign Up")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            var username: String by remember { mutableStateOf("") }
            OutlinedTextField(
                value = username,
                onValueChange = { v: String ->
                    username = v
                },
                placeholder = {
                    Text(
                        text = "Username",
                        fontSize = MaterialTheme.typography.h3.fontSize,
                        fontWeight = FontWeight.Bold
                    )
                },
                singleLine = true
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            var password: String by remember { mutableStateOf("") }
            OutlinedTextField(
                value = password,
                onValueChange = { w: String ->
                    password = w
                },
                placeholder = {
                    Text(
                        text = "Password",
                        fontSize = MaterialTheme.typography.h3.fontSize,
                        fontWeight = FontWeight.Bold
                    )
                },
                singleLine = true
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black),
                modifier = Modifier.padding(5.dp),
                onClick = {
                    //TODO: Navigate to Home Screen
                    navController.navigate(Screens.studentHome.route)
                }
            ) {
                Text(
                    text = "log in as student",
                    modifier = Modifier.padding(5.dp),
                    style = MaterialTheme.typography.button.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
            }
        }
    }
}