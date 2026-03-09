package com.example.loginapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.loginapp.R

@Composable
fun LoginScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF5B4FCF))
            .padding(24.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White, shape = RoundedCornerShape(40.dp))
                .padding(24.dp)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.imagen_login),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier
                    .height(300.dp)
                    .width(300.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Login",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier,
            ) {
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        text = "Name",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(5.dp)
                    )

                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .width(280.dp)
                            .height(40.dp)
                            .border(
                                BorderStroke(1.dp, Color.Gray),
                                RoundedCornerShape(12.dp)
                            ),
                        colors = TextFieldDefaults.colors(
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.White
                        ),
                        shape = RoundedCornerShape(12.dp)

                    )
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }

            Box(
                modifier = Modifier,
            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 10.dp)
                ) {
                    Text(
                        text = "Email",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(5.dp)
                    )
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .width(280.dp)
                            .height(40.dp)
                            .border(
                                BorderStroke(1.dp, Color.Gray),
                                RoundedCornerShape(12.dp)
                            ),
                        colors = TextFieldDefaults.colors(
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.White
                        ),
                        shape = RoundedCornerShape(12.dp)

                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Box(
                modifier = Modifier,
            ) {
                Column(
                    modifier = Modifier
                        .padding(
                            top = 14.dp,
                        )
                ) {
                    Text(
                        text = "Password",
                        fontSize = 16.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(5.dp)
                    )

                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .width(280.dp)
                            .height(40.dp)
                            .border(
                                BorderStroke(1.dp, Color.Gray),
                                RoundedCornerShape(12.dp)
                            ),
                        colors = TextFieldDefaults.colors(
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedContainerColor = Color.White
                        ),
                        shape = RoundedCornerShape(12.dp)

                    )
                    Text(
                        text = "Forgot Password?",
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier
                            .padding(10.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(81, 78, 184),
                    contentColor = Color.White
                ),
            ) {
                Text(
                    text = "Sign Up",
                    fontSize = 14.sp,
                    color = Color.White,
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    navController.navigate("welcome")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Gray
                ),
            ) {
                Text(
                    text = "Return",
                    fontSize = 14.sp,
                )
            }
        }
    }
}