package com.lrgs18120163.sicedroid.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
class CalificacionesFinalesS (
    @SerialName("grupo")
    val grupo : String = "",
    @SerialName("materia")
    val materia : String = "",
    @SerialName("calif")
    val calif : Int = 0,
    @SerialName("acred")
    val acred : String = "",
    @SerialName("Observaciones")
    val observaciones : String = ""
)

@Entity("CalificacionesFinales")
class CalificacionesFinales (
    @PrimaryKey
    val grupo : String = "",
    val materia : String = "",
    val calif : Int = 0,
    val acred : String = "",
    val observaciones : String = ""
)