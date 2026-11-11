package com.alnokhba.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val NokhbaColors = lightColorScheme(
    primary = Purple,
    secondary = Gold,
    background = Cream,
    surface = White,
    onPrimary = White,
    onSecondary = Dark
)

@Composable
fun AlNokhbaTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = NokhbaColors,
        typography = AppTypography,
        content = content
    )
}
