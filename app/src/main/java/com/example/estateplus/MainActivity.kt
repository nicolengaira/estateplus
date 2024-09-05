package com.example.estateplus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.estateplus.ui.theme.EstateplusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Demo()

        }
    }
}

@Composable
fun Demo(){
    Column(modifier = Modifier.fillMaxSize()){


        Text(
            text ="EstatePlus",
            color = Color.Magenta,
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive
        )

        Text(
            text ="An Adroid application that allows you to manage your properties",
            fontSize = 20.sp
        )

        Text(
            text ="List of Properties",
            fontSize = 25.sp
        )

        Text(
            text ="1.Lavington",)
            Text(text ="2.Westlands" )
            Text(text = "3.Donholm")
            Text(text = "4.Runda")




        
        


    }




}

@Composable
@Preview(showBackground = true)
fun  DemoPreview(){
    Demo()

}
