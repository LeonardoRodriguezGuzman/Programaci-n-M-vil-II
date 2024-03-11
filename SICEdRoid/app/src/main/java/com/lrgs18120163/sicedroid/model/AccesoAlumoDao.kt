package com.lrgs18120163.sicedroid.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface AccesoAlumoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarAccesoAlumno(accesoAlumno: AccesoAlumno): Long

    @Update
    suspend fun actualizarAccesoAlumno(accesoAlumno: AccesoAlumno): Int

    @Delete
    suspend fun eliminarAccesoAlumno(accesoAlumno: AccesoAlumno): Int

    @Query("SELECT * FROM AccesoAlumno WHERE matricula = :matricula")
    fun getAccesoAlumnoByMatricula(matricula: String): LiveData<AccesoAlumno>

    // Additional methods as needed
}

