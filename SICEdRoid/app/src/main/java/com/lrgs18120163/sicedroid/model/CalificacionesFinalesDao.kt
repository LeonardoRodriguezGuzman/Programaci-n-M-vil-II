package com.lrgs18120163.sicedroid.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface CalificacionesFinalesDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertarCalificacionesFinales(calificacionFinal: CalificacionesFinales)
    @Update
    fun actualizarCalifcacionFinal(calificacionFinal: CalificacionesFinales)
    @Delete
    fun eliminarCalificacionFinal(grupo: String)
    @Query("SELECT * FROM CalificacionesFinales WHERE grupo = :grupo")
    fun getCalificacionFinal(grupo: String) : LiveData<CalificacionesFinales>

    @Query("SELECT * FROM CalificacionesFinales")
    fun getAllCalificacionesFinales() : LiveData<CalificacionesFinales>
}