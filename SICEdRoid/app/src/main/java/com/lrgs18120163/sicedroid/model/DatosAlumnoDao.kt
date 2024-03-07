package com.lrgs18120163.sicedroid.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface DatosAlumnoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertarDatosAlumno(datosAlumno: DatosAlumno) : String
    @Update
    fun actualizarDatosAlumno(datosAlumno: DatosAlumno) : Boolean
    @Delete
    fun eliminarDatosAlumno(matricula: String) : Boolean
    @Query("SELECT * FROM DatosAlumno where matricula= :matricula")
    fun getDatosAlumno (matricula: String) : LiveData<DatosAlumno>
}