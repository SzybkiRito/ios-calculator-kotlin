package com.example.portfoliocourseapp.icons

import androidx.compose.ui.graphics.vector.ImageVector
import com.example.portfoliocourseapp.icons.calculatoricons.Divide
import com.example.portfoliocourseapp.icons.calculatoricons.Equal
import com.example.portfoliocourseapp.icons.calculatoricons.PlusMinus
import kotlin.collections.List as ____KtList

public object CalculatorIcons

private var __AllIcons: ____KtList<ImageVector>? = null

public val CalculatorIcons.AllIcons: ____KtList<ImageVector>
  get() {
    if (__AllIcons != null) {
      return __AllIcons!!
    }
    __AllIcons= listOf(Divide, Equal, PlusMinus)
    return __AllIcons!!
  }
