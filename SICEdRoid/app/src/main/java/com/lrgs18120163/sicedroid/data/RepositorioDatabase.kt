package com.lrgs18120163.sicedroid.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lrgs18120163.sicedroid.model.AccesoAlumno
import com.lrgs18120163.sicedroid.model.AccesoAlumoDao
import com.lrgs18120163.sicedroid.model.CalificacionesFinales
import com.lrgs18120163.sicedroid.model.CalificacionesUnidades
import com.lrgs18120163.sicedroid.model.CargaAcademica
import com.lrgs18120163.sicedroid.model.DatosAlumno
import com.lrgs18120163.sicedroid.model.Kardex


@Database(entities = [AccesoAlumno::class, DatosAlumno::class, CargaAcademica::class, Kardex::class, CalificacionesUnidades::class, CalificacionesFinales::class], version = 1, exportSchema = false)
abstract class RepositorioDatabase : RoomDatabase(){
    abstract fun getAccesoAlumnoDao(): AccesoAlumoDao

    companion object {
        @Volatile
        private var Instance: RepositorioDatabase? = null

        fun getDatabase(context: Context) : RepositorioDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, RepositorioDatabase::class.java, "AlumnoDatabase")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}