package edu.towson.cosc435.lancaster.studyup

//TODO: NO. NO. DO NOT UPDRAGE THE GRADLE

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import edu.towson.cosc435.lancaster.studyup.navigation.NavGraph
import edu.towson.cosc435.lancaster.studyup.ui.theme.StudyUpTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StudyUpTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    val navController = rememberNavController()
                    NavGraph(navController = navController)
                }
            }
        }
    }
} //HAHA NERD
//test 2 nerds