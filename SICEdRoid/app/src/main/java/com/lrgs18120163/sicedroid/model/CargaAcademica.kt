package com.lrgs18120163.sicedroid.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class CargaAcademicaS (
    @SerialName("Semipresencial")
    val semipresencial : String = "",
    @SerialName("Observaciones")
    val observaciones : String = "",
    @SerialName("Docente")
    val docente : String = "",
    @SerialName("clvOficial")
    val clvOficial : String = "",
    @SerialName("Sabado")
    val sabado : String = "",
    @SerialName("Viernes")
    val viernes : String = "",
    @SerialName("Jueves")
    val jueves : String = "",
    @SerialName("Miercoles")
    val miercoles : String = "",
    @SerialName("Martes")
    val martes : String = "",
    @SerialName("Lunes")
    val lunes : String = "",
    @SerialName("EstadoMateria")
    val estadoMateria : String = "",
    @SerialName("CreditosMateria")
    val creditosMateria : Int = 0,
    @SerialName("Materia")
    val materia : String = "",
    @SerialName("Grupo")
    val grupo : String = ""
)
@Entity
data class CargaAcademica (
    val semipresencial : String = "",
    val observaciones : String = "",
    val docente : String = "",
    val clvOficial : String = "",
    val sabado : String = "",
    val viernes : String = "",
    val jueves : String = "",
    val miercoles : String = "",
    val martes : String = "",
    val lunes : String = "",
    val estadoMateria : String = "",
    val creditosMateria : Int = 0,
    val materia : String = "",
    @PrimaryKey
    val grupo : String = ""
)
