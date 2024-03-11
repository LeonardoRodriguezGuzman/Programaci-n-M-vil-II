package com.lrgs18120163.sicedroid.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface KardexDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertarKardex(kardex: Kardex) : String
    @Update
    fun actualizarKardex(kardex: Kardex) : Boolean
    @Delete
    fun eliminarKardex(clvMat : String) : Boolean
    @Query("SELECT * FROM Kardex where clvMat= :clvMat")
    fun getKardexMateria(clvMat : String) : LiveData<Kardex>

    @Query("SELECT * FROM Kardex")
    fun getAllKardex() : LiveData<List<Kardex>>
}