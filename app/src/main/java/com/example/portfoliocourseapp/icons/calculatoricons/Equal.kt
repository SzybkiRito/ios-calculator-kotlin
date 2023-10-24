package com.example.portfoliocourseapp.icons.calculatoricons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.example.portfoliocourseapp.icons.CalculatorIcons

public val CalculatorIcons.Equal: ImageVector
    get() {
        if (_equal != null) {
            return _equal!!
        }
        _equal = Builder(name = "Equal", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 18.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(8.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-16.0f)
                close()
            }
        }
        .build()
        return _equal!!
    }

private var _equal: ImageVector? = null
