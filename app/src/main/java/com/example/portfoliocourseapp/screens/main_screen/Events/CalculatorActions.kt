package com.example.portfoliocourseapp.screens.main_screen.Events

sealed class CalculatorActions {
    data class Number(val number: Int) : CalculatorActions()
    object Clear: CalculatorActions()
    object Delete: CalculatorActions()
    object Decimal: CalculatorActions()
    object Calculate: CalculatorActions()
    object ChangeSignOfNumber: CalculatorActions()
    data class Operation(val operation: CalculatorOperation) : CalculatorActions()
}