package edu.towson.cosc435.lancaster.studyup.screens.appointment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun appointmentRequestScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Text(
                text = "View Appointment Requests Here",
                fontSize = MaterialTheme.typography.h3.fontSize,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
        LazyColumn{
            itemsIndexed(
                listOf("Student A", "Student B", "Student C", "Student D", "Student D")
            ){index, string ->
                Text(
                    text = string,
                    modifier = Modifier.padding(5.dp),
                    style = MaterialTheme.typography.button.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                )
            }
        }
    }
}