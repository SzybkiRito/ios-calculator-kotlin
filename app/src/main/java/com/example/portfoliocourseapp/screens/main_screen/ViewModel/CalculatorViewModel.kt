package com.example.portfoliocourseapp.screens.main_screen.ViewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.portfoliocourseapp.screens.main_screen.Events.CalculatorActions
import com.example.portfoliocourseapp.screens.main_screen.Events.CalculatorOperation
import com.example.portfoliocourseapp.screens.main_screen.Events.CalculatorState

class CalculatorViewModel : ViewModel() {
    var state by mutableStateOf(CalculatorState())
    private var tempNumber1: String = ""

    fun onAction(action: CalculatorActions) {
        when(action) {
            is CalculatorActions.Number -> enterNumber(action.number)
            is CalculatorActions.Clear -> {
                tempNumber1 = ""
                state = CalculatorState()
            }
            is CalculatorActions.Operation -> enterOperation(action.operation)
            is CalculatorActions.Decimal -> enterDecimal()
            is CalculatorActions.Calculate -> calculate()
            is CalculatorActions.ChangeSignOfNumber -> changeSignOfNumber()
            else -> null
        }
    }

    private fun formatCalculatedResult(result: Double) : String {
        val formattedResult: String = if(result == result.toInt().toDouble()) {
            result.toInt().toString()
        } else {
            result.toString()
        }

        return formattedResult
    }

    private fun calculate() {
        val number1 = tempNumber1.toDouble()
        val number2 = state.number2.toDouble()

        when(state.operation) {
            is CalculatorOperation.Add -> {
                val result: Double = number1 + number2
                state = state.copy(
                    number1 = formatCalculatedResult(result),
                    number2 = "",
                    operation = null
                )
                tempNumber1 = ""
            }
            is CalculatorOperation.Divide -> {
                val result: Double = number1 / number2
                state = state.copy(
                    number1 = formatCalculatedResult(result),
                    number2 = "",
                    operation = null
                )
                tempNumber1 = ""
            }
            is CalculatorOperation.Subtract -> {
                val result: Double = number1 - number2
                state = state.copy(
                    number1 = formatCalculatedResult(result),
                    number2 = "",
                    operation = null
                )
                tempNumber1 = ""
            }
            is CalculatorOperation.Multiply -> {
                val result: Double = number1 * number2
                state = state.copy(
                    number1 = formatCalculatedResult(result),
                    number2 = "",
                    operation = null
                )
                tempNumber1 = ""
            }
            else -> null
        }
    }

    private fun changeSignOfNumber() {
        if(state.operation == null && state.number1.isNotBlank() && state.number1.first() != '0') {
            if(state.number1.first() == '-') {
                state = state.copy(
                    number1 = state.number1.drop(1)
                )
                tempNumber1 = state.number1
            } else {
                state = state.copy(
                    number1 = state.number1.replaceRange(0, 0, "-")
                )
                tempNumber1 = state.number1
            }
        }
    }

    private fun enterDecimal() {
        if(state.operation == null && !state.number1.contains(".") && state.number1.isNotBlank()) {
            state = state.copy(
                number1 = state.number1 + '.'
            )
        } else if(!state.number2.contains(".") && state.number2.isNotBlank()) {
            state = state.copy(
                number2 = state.number2 + '.'
            )
        }
    }

    private fun enterOperation(operation: CalculatorOperation) {
        if(state.number1.isNotBlank()) {
            state = state.copy(operation = operation)
        }
    }

    private fun enterNumber(number: Int) {
        val isFirstNumberEmptyAndStartsWithZero = (state.number1.isNotBlank() && state.number1[0] == '0') && !state.number1.contains(".")
        val isSecondNumberEmptyAndStartsWithZero = state.number2.isNotBlank() && state.number2[0] == '0' && !state.number1.contains(".")

        when {
            isFirstNumberEmptyAndStartsWithZero -> state = state.copy(number1 = "")
            isSecondNumberEmptyAndStartsWithZero -> state = state.copy(number2 = "")
        }

        if (state.operation == null) {
            state = state.copy(number1 = state.number1 + number)
            tempNumber1 = state.number1
        } else {
            state = state.copy(number1 = "", number2 = state.number2 + number)
        }
    }
}