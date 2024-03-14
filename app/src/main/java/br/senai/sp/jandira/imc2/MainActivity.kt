package br.senai.sp.jandira.imc2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc2.ui.theme.IMC2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMC2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)
                .background(Color(0xF9B1163F))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Card(
                modifier = Modifier.size(
                    width = 80.dp, height = 80.dp
                ),
                shape = CircleShape,
                border = BorderStroke(width = 2.dp, color = Color.Black),
                elevation = CardDefaults.cardElevation(16.dp),

                ) {
                Image(
                    painter = painterResource(id = R.drawable.bmi),
                    contentDescription = "Imagem de um BMI"
                )
            }
            Text(
                modifier = Modifier.padding(19.dp),
                text = "Calculadora IMC",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 29.sp
            )
        }


        Card(
            modifier = Modifier
                .size(
                    width = 360.dp, height = 400.dp
                )
                .offset(y = -70.dp)
                .padding(16.dp),
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(
                    text = "Seus Dados",
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp,
                    color = Color(0xF9B1163F),
                    modifier = Modifier.padding(bottom = 24.dp)
                )
                Column(
                    modifier = Modifier.padding(bottom = 24.dp)
                ) {
                    Text(
                        text = "Seu peso:", fontSize = 16.sp, color = Color(0xF9B1163F)
                    )
                    OutlinedTextField(value = "", onValueChange = {}, label = {
                        Text(
                            text = "Seu peso em KG", color = Color.Black
                        )
                    }, colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xF9B1163F),
                        focusedBorderColor = Color(0xF9B1163F)
                    ), modifier = Modifier.padding(
                        bottom = 8.dp
                    )
                    )
                }

                Column(
                    modifier = Modifier.padding(bottom = 24.dp)
                ) {
                    Text(
                        text = "Sua Altura:", fontSize = 16.sp, color = Color(0xF9B1163F)
                    )
                    OutlinedTextField(value = "", onValueChange = {}, label = {
                        Text(
                            text = "Digite sua altura", color = Color.Black
                        )
                    }, colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xF9B1163F),
                        focusedBorderColor = Color(0xF9B1163F)
                    ), modifier = Modifier.padding(
                        bottom = 3.dp
                    )
                    )
                    
                }
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .width(200.dp)
                        .height(50.dp),
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xF9B1163F)
                    )
                ) {
                    Text(
                        text = "CALCULAR",
                        color = Color.White,
                    )
                }
            }
        }

        Card(
            modifier = Modifier
                .width(360.dp)
                .height(150.dp)
                .padding(12.dp)
                .offset(y = -34.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xff329F6B))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(modifier = Modifier, text = "Resultado Ideal", color = Color.White)
                    Text(
                        modifier = Modifier,
                        text = "Peso Ideal",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp
                    )
                }
                Text(
                    modifier = Modifier.padding(24.dp),
                    text = "21.3",
                    color = Color.White,
                    fontSize = 34.sp
                )
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMC2Theme {
        Greeting()
    }
}