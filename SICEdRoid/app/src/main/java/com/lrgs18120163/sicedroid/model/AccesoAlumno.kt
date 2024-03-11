package com.lrgs18120163.sicedroid.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Dao

@Serializable
data class AccesoAlumnoS (
    @SerialName("acceso")
    val acceso : Boolean = false,
    @SerialName("estatus")
    val estatus : String = "",
    @SerialName("tipoUsuario")
    val tipoUsuario : Int = 0,
    @SerialName("contrasenia")
    val contrasenia : String = "",
    @SerialName("matricula")
    val matricula : String = ""
)

@Entity(tableName = "AccesoAlumno")
data class AccesoAlumno (
    @PrimaryKey
    val matricula : String = "",
    val acceso : Boolean = false,
    val estatus : String = "",
    val tipoUsuario : Int = 0,
    val contrasenia : String = ""

)