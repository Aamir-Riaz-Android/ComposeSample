package com.example.sampleproject.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(4.dp),
    medium = RoundedCornerShape(4.dp),
    large = RoundedCornerShape(0.dp)
)

val Shapes.cardItemNoRoundedShape: Shape
    @Composable get() {
        return RectangleShape
    }

val Shapes.buttonRoundedShape: RoundedCornerShape
    @Composable get() {
        return RoundedCornerShape(12.dp)
    }

val Shapes.inputFieldRoundedShape: RoundedCornerShape
    @Composable get() {
        return RoundedCornerShape(12.dp)
    }

val Shapes.editsCardItemRoundedShape: RoundedCornerShape
    @Composable get() {
        return RoundedCornerShape(5.dp)
    }

val Shapes.cardItemRoundedShape: RoundedCornerShape
    @Composable get() {
        return RoundedCornerShape(8.dp)
    }

val Shapes.secondaryStandardButtonRoundedShape: RoundedCornerShape
    @Composable get() {
        return RoundedCornerShape(5.dp)
    }