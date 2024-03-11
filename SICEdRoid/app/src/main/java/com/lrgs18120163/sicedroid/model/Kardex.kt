package com.lrgs18120163.sicedroid.model

import androidx.compose.runtime.rememberCompositionContext
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Serializable
data class KardexS (
    @SerialName("S3")
    val s3 : String?,
    @SerialName("P3")
    val p3 : String?,
    @SerialName("A3")
    val a3 : String?,
    @SerialName("ClvMat")
    val clvMat : String,
    @SerialName("ClvOfiMat")
    val clvOfiMat : String,
    @SerialName("Materia")
    val materia : String,
    @SerialName("Cdts")
    val cdts : Int,
    @SerialName("Calif")
    val calif : Int,
    @SerialName("Acred")
    val acred : String,
    @SerialName("S1")
    val s1 : String,
    @SerialName("P1")
    val p1 : String,
    @SerialName("A1")
    val a1 : String,
    @SerialName("S2")
    val s2 : String?,
    @SerialName("P2")
    val p2 : String?,
    @SerialName("A2")
    val a2 : String?
)
@Entity("Kardex")
data class Kardex (
    @PrimaryKey
    val clvMat : String,
    val s3 : String?,
    val p3 : String?,
    val a3 : String?,
    val clvOfiMat : String,
    val materia : String,
    val cdts : Int,
    val calif : Int,
    val acred : String,
    val s1 : String,
    val p1 : String,
    val a1 : String,
    val s2 : String?,
    val p2 : String?,
    val a2 : String?
)