package com.register.registersign2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.register.registersign2.ui.theme.RegisterSign2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RegisterSign2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting()

                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .padding(10.dp),
            shape = RoundedCornerShape(20.dp),
            border = BorderStroke(4.dp,Color.Gray),
            elevation = CardDefaults.cardElevation(10.dp)

        ) {
            Image(painter = painterResource(id =R.drawable.abc), contentDescription ="" )




        }
        Spacer(modifier =Modifier.height(30.dp))
        Text(text = "Discover Your", fontSize =35.sp, fontWeight = FontWeight.Bold)
        Text(text = "Dream Job Here",fontSize =35.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier =Modifier.height(15.dp))
        Text(text = "Love of the most exciting jobs roles", color = Color.Gray)
        Text(text = "based on your interes in study major", color = Color.Gray)
        Spacer(modifier =Modifier.height(80.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(horizontal = 50.dp)) {
            Button(modifier =Modifier
                .height(50.dp)
                .weight(0.5f), onClick = { /*TODO*/ }) {

                Text(text = "Register")

                
            }
            OutlinedButton(modifier = Modifier
                .height(50.dp)
                .weight(0.5f), onClick = { /*TODO*/ }) {
                Text(text = "Sign in")
                
            }

        }


    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RegisterSign2Theme {
        Greeting()
    }
}