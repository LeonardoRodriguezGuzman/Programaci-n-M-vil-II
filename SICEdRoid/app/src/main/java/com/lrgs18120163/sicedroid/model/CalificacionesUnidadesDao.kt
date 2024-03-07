package com.lrgs18120163.sicedroid.model

import androidx.coordinatorlayout.widget.ViewGroupUtils
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CalifcacionesUnidadesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertarCalificacionesUnidades(calificacionesUnidades: CalificacionesUnidades) : String
    @Update
    fun actualizarCalificacionesUnidades(calificacionesUnidades: CalificacionesUnidades) : Boolean
    @Delete
    fun eliminarCalificacionesUnidades(grupo: String) : Boolean
    @Query("SELECT * FROM CalificacionesUnidades where grupo= :grupo")
    fun getCalifcaciconesUnidades (grupo: String) : LiveData<CalificacionesUnidades>

    @Query("SELECT * FROM CalificacionesUnidades")
    fun getAllCalificacionesUnidades() : LiveData<List<CalificacionesUnidades>>


}