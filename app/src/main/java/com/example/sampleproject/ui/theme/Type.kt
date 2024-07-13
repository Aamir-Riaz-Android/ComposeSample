package com.example.sampleproject.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.sampleproject.R

val font = FontFamily(
    Font(
        R.font.montserrat_regular, weight = FontWeight.Normal
    ), Font(
        R.font.montserrat_bold, weight = FontWeight.Bold
    ), Font(
        R.font.montserrat_semi_bold, weight = FontWeight.SemiBold
    ), Font(
        R.font.montserrat_medium, weight = FontWeight.Medium
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = font,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        lineHeight = 27.sp
    ),

    headlineMedium = TextStyle(
        fontFamily = font,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 27.sp,
        letterSpacing = 0.8.sp
    ),

    headlineSmall = TextStyle(
        fontFamily = font,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),

    bodyLarge = TextStyle(
        fontFamily = font,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    bodyMedium = TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 24.sp
    ),
)

val bodyTitle: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            lineHeight = 27.sp
        )
    }

val body: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 27.sp
        )
    }

val button2: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            letterSpacing = 0.05.sp
        )
    }

val inputField: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 24.sp
        )
    }

val kotlin.text.Typography.captionTitle: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp,
            lineHeight = 16.sp
        )
    }

val kotlin.text.Typography.captionDescription: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp
        )
    }

val kotlin.text.Typography.captionButton: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Bold,
            fontSize = 10.sp
        )
    }

val kotlin.text.Typography.smallCaptionBody: TextStyle
    @Composable get() {
        return TextStyle(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontFamily = font,
            fontWeight = FontWeight.Medium,
        )
    }

val kotlin.text.Typography.captionBody: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Medium,
            fontSize = 10.sp
        )
    }

val kotlin.text.Typography.openingHoursContent: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Medium,
            lineHeight = 16.sp,
            fontSize = 10.sp
        )
    }

val kotlin.text.Typography.openingHoursTitle: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.SemiBold,
            lineHeight = 16.sp,
            fontSize = 10.sp
        )
    }

val kotlin.text.Typography.smCardTitle: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.SemiBold,
            fontSize = 10.sp
        )
    }

val kotlin.text.Typography.smCardBody: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Medium,
            fontSize = 7.sp,
            lineHeight = 16.sp
        )
    }

val kotlin.text.Typography.confirmationDialogTitle: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.SemiBold,
            fontSize = 17.sp,
            lineHeight = 22.sp
        )
    }

val btnSecondary: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp,
            lineHeight = 27.sp
        )
    }

val kotlin.text.Typography.dropOffDistance: TextStyle
    @Composable get() {
        return TextStyle(
            fontFamily = font,
            fontWeight = FontWeight.Medium,
            fontSize = 10.sp,
            lineHeight = 16.sp
        )
    }