package com.manuelsantos.ejemplosnavigation.navegacion

import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

@Serializable
data class Detalle(val nombre: String)