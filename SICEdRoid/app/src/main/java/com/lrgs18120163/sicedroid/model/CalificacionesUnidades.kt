package com.lrgs18120163.sicedroid.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Entity("CalificacionesUnidades")
@Serializable
data class CalificacionesUnidades (
    @PrimaryKey
    @SerialName("Grupo")
    val grupo : String = "",
    @SerialName("Materia")
    val materia : String = "",
    @SerialName("UnidadesActivas")
    val unidadesActivas : String = "",
    @SerialName("C1")
    val c1 : String?,
    @SerialName("C2")
    val c2 : String?,
    @SerialName("C3")
    val c3 : String?,
    @SerialName("C4")
    val c4 : String?,
    @SerialName("C5")
    val c5 : String?,
    @SerialName("C6")
    val c6 : String?,
    @SerialName("C7")
    val c7 : String?,
    @SerialName("C8")
    val c8 : String?,
    @SerialName("C9")
    val c9 : String?,
    @SerialName("C10")
    val c10 : String?,
    @SerialName("C11")
    val c11 : String?,
    @SerialName("C12")
    val c12 : String?,
    @SerialName("C13")
    val c13 : String?,
    @SerialName("Observaciones")
    val observaciones : String = ""
)
