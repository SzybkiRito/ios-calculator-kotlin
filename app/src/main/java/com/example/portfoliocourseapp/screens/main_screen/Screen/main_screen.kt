package com.example.portfoliocourseapp.screens.main_screen.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import calculatorButton
import com.example.portfoliocourseapp.icons.CalculatorIcons
import com.example.portfoliocourseapp.icons.calculatoricons.Divide
import com.example.portfoliocourseapp.icons.calculatoricons.Equal
import com.example.portfoliocourseapp.icons.calculatoricons.PlusMinus
import com.example.portfoliocourseapp.screens.main_screen.Events.CalculatorActions
import com.example.portfoliocourseapp.screens.main_screen.Events.CalculatorOperation
import com.example.portfoliocourseapp.screens.main_screen.ViewModel.CalculatorViewModel
import com.example.portfoliocourseapp.theme.Colors

@Composable
fun MainScreen() {
    val defaultScreenPadding: Dp = 8.dp
    val buttonSpace: Dp = 8.dp
    val viewModel = viewModel<CalculatorViewModel>()
    val calculatorState = viewModel.state

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(defaultScreenPadding)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpace),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth() // Match the width of the buttons
                    .height(65.dp)  // Match the height of the buttons
            ) {
                Text(
                    text = calculatorState.number1 + calculatorState.number2,
                    fontSize = 36.sp,
                    textAlign = TextAlign.End,
                    color = Color.White,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                calculatorButton(
                    symbol = "AC",
                    buttonColor = Colors.LightGray,
                    contentColor = Color.Black,
                    onClick = {
                        viewModel.onAction(CalculatorActions.Clear)
                    }
                )
                calculatorButton(
                    symbol = "+/-",
                    imageVector = CalculatorIcons.PlusMinus,
                    buttonColor = Colors.LightGray,
                    contentColor = Color.Black,
                    onClick = {
                        viewModel.onAction(CalculatorActions.ChangeSignOfNumber)
                    }
                )
                calculatorButton(
                    symbol = "%",
                    buttonColor = Colors.LightGray,
                    contentColor = Color.Black,
                    onClick = {
                        println("Clicked!")
                    }
                )
                calculatorButton(
                    symbol = "/",
                    imageVector = CalculatorIcons.Divide,
                    buttonColor = Colors.Orange,
                    contentColor = Color.White,
                    onClick = {
                        viewModel.onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                for (i in 7..9) {
                    calculatorButton(
                        symbol = i.toString(),
                        buttonColor = Colors.DarkGray,
                        contentColor = Color.White,
                        onClick = {
                            viewModel.onAction(CalculatorActions.Number(i))
                        }
                    )
                }
                calculatorButton(
                    symbol = "X",
                    buttonColor = Colors.Orange,
                    contentColor = Color.White,
                    onClick = {
                        viewModel.onAction(CalculatorActions.Operation(CalculatorOperation.Multiply))
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                for (i in 4..6) {
                    calculatorButton(
                        symbol = i.toString(),
                        buttonColor = Colors.DarkGray,
                        contentColor = Color.White,
                        onClick = {
                            viewModel.onAction(CalculatorActions.Number(i))
                        }
                    )
                }
                calculatorButton(
                    symbol = "-",
                    buttonColor = Colors.Orange,
                    contentColor = Color.White,
                    onClick = {
                        viewModel.onAction(CalculatorActions.Operation(CalculatorOperation.Subtract))
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                for (i in 1..3) {
                    calculatorButton(
                        symbol = i.toString(),
                        buttonColor = Colors.DarkGray,
                        contentColor = Color.White,
                        onClick = {
                            viewModel.onAction(CalculatorActions.Number(i))
                        }
                    )
                }
                calculatorButton(
                    symbol = "+",
                    buttonColor = Colors.Orange,
                    contentColor = Color.White,
                    onClick = {
                        viewModel.onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                    }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                calculatorButton(
                    symbol = "0",
                    buttonColor = Colors.DarkGray,
                    contentColor = Color.White,
                    modifier = Modifier
                        .width(150.dp)
                        .height(65.dp),
                    onClick = {
                        viewModel.onAction(CalculatorActions.Number(0))
                    }
                )
                calculatorButton(
                    symbol = ".",
                    buttonColor = Colors.DarkGray,
                    contentColor = Color.White,
                    onClick = {
                        viewModel.onAction(CalculatorActions.Decimal)
                    }
                )
                calculatorButton(
                    symbol = "=",
                    imageVector = CalculatorIcons.Equal,
                    buttonColor = Colors.Orange,
                    contentColor = Color.White,
                    onClick = {
                        viewModel.onAction(CalculatorActions.Calculate)
                    }
                )
            }
        }
    }
}