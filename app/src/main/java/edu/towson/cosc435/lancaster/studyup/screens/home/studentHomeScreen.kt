package edu.towson.cosc435.lancaster.studyup.screens.home

import android.widget.Toast
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import edu.towson.cosc435.lancaster.studyup.navigation.Screens

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterialApi::class)
@Composable
fun studentHomeScreen(navController: NavController) {



    val contextForToast = LocalContext.current.applicationContext

    val listItems = arrayOf("Tutor A (Science)", "Tutor B (Math)", "Tutor C (Math)", "Tutor D (Android Dev)")

    var selectedItem by remember {
        mutableStateOf(listItems[0])
    }

    var expanded by remember {
        mutableStateOf(false)
    }


    LazyColumn(
        //cells = GridCells.Adaptive(160.dp),
        contentPadding = PaddingValues(horizontal = 10.dp),
        //horizontalArrangement = Arrangement.spacedBy(15.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {




        item{
            // the box
            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = {
                    expanded = !expanded
                }
            ) {

                // text field
                TextField(
                    value = selectedItem,
                    onValueChange = {},
                    readOnly = true,
                    label = { Text(text = "Tutor Selected") },
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(
                            expanded = expanded
                        )
                    },
                    colors = ExposedDropdownMenuDefaults.textFieldColors()
                )

                // menu
                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    listItems.forEach { selectedOption ->
                        // menu item
                        DropdownMenuItem(onClick = {
                            selectedItem = selectedOption
                            Toast.makeText(contextForToast, selectedOption, Toast.LENGTH_SHORT).show()
                            expanded = false
                        }) {
                            Text(text = selectedOption)
                        }
                    }
                }
            }
        }




        item{
            Card(
                backgroundColor = Color.Blue,
                modifier = Modifier.padding(15.dp).clickable{ navController.navigate(Screens.studentAppointmentScreen.route) }
            ){
                Text(
                    text = "Appointments",
                    fontSize = MaterialTheme.typography.h3.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        item{
            Card(
                backgroundColor = Color.Blue,
                modifier = Modifier.padding(15.dp).clickable{ navController.navigate(Screens.studentAssignment.route) }
            ){
                Text(
                    text = "Assignments",
                    fontSize = MaterialTheme.typography.h3.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        item{
            Card(
                backgroundColor = Color.Blue,
                modifier = Modifier.padding(15.dp).clickable{ navController.navigate(Screens.Detail.route) }
            ){
                Text(
                    text = "Messaging",
                    fontSize = MaterialTheme.typography.h3.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        item{
            Card(
                backgroundColor = Color.Blue,
                modifier = Modifier.padding(15.dp).clickable{ navController.navigate(Screens.ReminderScreen.route) }
            ){
                Text(
                    text = "Reminders",
                    fontSize = MaterialTheme.typography.h3.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        item{
            Card(
                backgroundColor = Color.Blue,
                modifier = Modifier.padding(15.dp).clickable{ navController.navigate(Screens.addTutorScreen.route) }
            ){
                Text(
                    text = "Add Tutor",
                    fontSize = MaterialTheme.typography.h3.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        item{
            Card(
                backgroundColor = Color.Blue,
                modifier = Modifier.padding(15.dp).clickable{ navController.navigate(Screens.studentReadingMatScreen.route) }
            ){
                Text(
                    text = "read me",
                    fontSize = MaterialTheme.typography.h3.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        item{
            Card(
                backgroundColor = Color.Blue,
                modifier = Modifier.padding(15.dp).clickable{ navController.navigate(Screens.Login.route) }
            ){
                Text(
                    text = "logout",
                    fontSize = MaterialTheme.typography.h5.fontSize,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        //
    }
}

@Composable
@Preview
fun studentHomeScreenPreview() {
    val navController = rememberNavController()
    HomeScreen(navController)
}