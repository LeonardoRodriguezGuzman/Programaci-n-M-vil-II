package com.lrgs18120163.sicedroid.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface CargaAcademicaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertarCargaAcademica(cargaAcademica: CargaAcademica) : String
    @Update
    fun actualizarCargaAcademica(cargaAcademica: CargaAcademica) : Boolean
    @Delete
    fun eliminarCargaAcademica(grupo: String) : Boolean
    @Query("SELECT * FROM CargaAcademica where grupo = :grupo")
    fun getCargaAcademicaGrupo (grupo: String) : LiveData<CargaAcademica>

    @Query("SELECT * FROM CargaAcademica")
    fun getAllCargaAcademica(grupo: String) :LiveData<List<CargaAcademica>>


}