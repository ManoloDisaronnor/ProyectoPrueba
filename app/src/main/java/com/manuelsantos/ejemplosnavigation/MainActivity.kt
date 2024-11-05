package com.manuelsantos.ejemplosnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.manuelsantos.ejemplosnavigation.navegacion.Navegacion
import com.manuelsantos.ejemplosnavigation.ui.theme.EjemplosNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EjemplosNavigationTheme {
                Navegacion()
                //Commit de pedro
            }
        }
    }
}
