package com.lrgs18120163.sicedroid.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class DatosAlumnoS(
    @SerialName("fechaReins")
    var fechaReins: String,
    @SerialName("modEducativo")
    var modEducativo: Int,
    @SerialName("adeudo")
    var adeudo: Boolean,
    @SerialName("urlFoto")
    var urlFoto: String,
    @SerialName("adeudoDescripcion")
    var adeudoDescripcion: String,
    @SerialName("inscrito")
    var inscrito: Boolean,
    @SerialName("estatus")
    var estatus: String,
    @SerialName("semActual")
    var semActual: Int,
    @SerialName("cdtosAcumulados")
    var cdtosAcumulados: Int,
    @SerialName("cdtosActuales")
    var cdtosActuales: Int,
    @SerialName("especialidad")
    var especialidad: String,
    @SerialName("carrera")
    var carrera: String,
    @SerialName("lineamiento")
    var lineamiento: Int,
    @SerialName("nombre")
    var nombre: String,
    @SerialName("matricula")
    var matricula: String
)

@Entity("DatosAlumno")
data class DatosAlumno(
    @PrimaryKey
    var matricula: String,
    var fechaReins: String,
    var modEducativo: Int,
    var adeudo: Boolean,
    var urlFoto: String,
    var adeudoDescripcion: String,
    var inscrito: Boolean,
    var estatus: String,
    var semActual: Int,
    var cdtosAcumulados: Int,
    var cdtosActuales: Int,
    var especialidad: String,
    var carrera: String,
    var lineamiento: Int,
    var nombre: String
)