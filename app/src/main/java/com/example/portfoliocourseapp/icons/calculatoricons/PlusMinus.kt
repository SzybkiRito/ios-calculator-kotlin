package com.example.portfoliocourseapp.icons.calculatoricons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.portfoliocourseapp.icons.CalculatorIcons

public val CalculatorIcons.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) {
            return _plusMinus!!
        }
        _plusMinus = Builder(name = "PlusMinus", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 141.293f, viewportHeight = 141.293f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(77.955f, 109.975f)
                curveToRelative(-4.037f, 0.0f, -7.309f, 3.271f, -7.309f, 7.308f)
                curveToRelative(0.0f, 4.037f, 3.272f, 7.31f, 7.309f, 7.31f)
                horizontalLineToRelative(56.029f)
                curveToRelative(4.037f, 0.0f, 7.309f, -3.271f, 7.309f, -7.31f)
                curveToRelative(0.0f, -4.036f, -3.271f, -7.308f, -7.309f, -7.308f)
                horizontalLineTo(77.955f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 44.2f)
                curveToRelative(0.0f, 4.037f, 3.272f, 7.308f, 7.309f, 7.308f)
                horizontalLineToRelative(19.489f)
                verticalLineToRelative(19.49f)
                curveToRelative(0.0f, 4.036f, 3.271f, 7.309f, 7.308f, 7.309f)
                curveToRelative(4.037f, 0.0f, 7.309f, -3.271f, 7.309f, -7.309f)
                verticalLineToRelative(-19.49f)
                horizontalLineTo(63.34f)
                curveToRelative(4.037f, 0.0f, 7.308f, -3.271f, 7.308f, -7.308f)
                curveToRelative(0.0f, -4.037f, -3.271f, -7.309f, -7.308f, -7.309f)
                horizontalLineTo(41.414f)
                verticalLineTo(12.53f)
                curveToRelative(0.0f, -4.037f, -3.272f, -7.308f, -7.309f, -7.308f)
                curveToRelative(-4.037f, 0.0f, -7.308f, 3.271f, -7.308f, 7.308f)
                verticalLineToRelative(24.361f)
                horizontalLineTo(7.308f)
                curveTo(3.272f, 36.892f, 0.0f, 40.164f, 0.0f, 44.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(131.428f, 17.261f)
                curveToRelative(-2.854f, -2.855f, -7.481f, -2.855f, -10.336f, 0.0f)
                lineTo(14.763f, 123.594f)
                curveToRelative(-2.853f, 2.854f, -2.853f, 7.481f, 0.0f, 10.334f)
                curveToRelative(1.425f, 1.429f, 3.298f, 2.143f, 5.167f, 2.143f)
                curveToRelative(1.868f, 0.0f, 3.742f, -0.714f, 5.169f, -2.143f)
                lineTo(131.428f, 27.599f)
                curveTo(134.283f, 24.746f, 134.283f, 20.114f, 131.428f, 17.261f)
                close()
            }
        }
        .build()
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
