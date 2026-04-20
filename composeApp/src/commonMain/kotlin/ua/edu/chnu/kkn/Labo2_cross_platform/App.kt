package ua.edu.chnu.kkn.Labo2_cross_platform

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import ua.edu.chnu.kkn.Labo2_cross_platform.ui.screens.AppNavigation
import ua.edu.chnu.kkn.Labo2_cross_platform.ui.theme.AppTheme

@Composable
@Preview
fun App() {
    AppTheme {
        AppNavigation()
    }
}
