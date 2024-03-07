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
    fun insertarAccesoAlumno(accesoAlumno: AccesoAlumno) : String
    @Update
    fun actualizarAccesoAlumno(accesoAlumno: AccesoAlumno) : Boolean
    @Delete
    fun eliminarAccesoAlumno(accesoAlumno: AccesoAlumno) : Boolean
    @Query("SELECT * FROM AccesoAlumno WHERE matricula = :matricula")
    fun getAccesoAlumnoByMatricula(matricula: String) : LiveData<AccesoAlumno>
}
