package com.lrgs18120163.sicedroid.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "AccesoAlumno")
@Serializable
data class AccesoAlumno (
    @SerialName("acceso")
    val acceso : Boolean = false,
    @SerialName("estatus")
    val estatus : String = "",
    @SerialName("tipoUsuario")
    val tipoUsuario : Int = 0,
    @SerialName("contrasenia")
    val contrasenia : String = "",
    @PrimaryKey
    @SerialName("matricula")
    val matricula : String = ""
)
