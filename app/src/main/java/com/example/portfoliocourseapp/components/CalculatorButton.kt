import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun calculatorButton(
    symbol: String,
    imageVector: ImageVector? = null,
    buttonColor: Color,
    contentColor: Color,
    modifier: Modifier = Modifier
        .width(65.dp)
        .height(65.dp),
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .wrapContentWidth()
            .padding(horizontal = 8.dp)
    ) {
        Button(
            contentPadding = PaddingValues(all = 12.dp),
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = buttonColor,
            ),
            modifier = modifier,
            onClick = { onClick() }
        ) {
            if(imageVector == null) {
                Text(
                    text = symbol,
                    fontSize = 24.sp,
                    color = contentColor,
                    textAlign = TextAlign.Center,
                )
            } else {
                Icon(
                    imageVector = imageVector,
                    modifier = Modifier
                        .size(24.dp),
                    tint = contentColor,
                    contentDescription = null
                )
            }
        }
    }
}