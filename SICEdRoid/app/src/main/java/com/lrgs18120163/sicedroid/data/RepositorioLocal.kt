package com.lrgs18120163.sicedroid.data

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.lrgs18120163.sicedroid.model.AccesoAlumno
import com.lrgs18120163.sicedroid.model.AccesoAlumoDao
import com.lrgs18120163.sicedroid.model.CalifcacionesUnidadesDao
import com.lrgs18120163.sicedroid.model.CalificacionesFinales
import com.lrgs18120163.sicedroid.model.CalificacionesFinalesDao
import com.lrgs18120163.sicedroid.model.CalificacionesUnidades
import com.lrgs18120163.sicedroid.model.CargaAcademica
import com.lrgs18120163.sicedroid.model.CargaAcademicaDao
import com.lrgs18120163.sicedroid.model.DatosAlumno
import com.lrgs18120163.sicedroid.model.DatosAlumnoDao
import com.lrgs18120163.sicedroid.model.Kardex
import com.lrgs18120163.sicedroid.model.KardexDao

class RepositorioLocal(
    private val accesoAlumoDao: AccesoAlumoDao,
    private val datosAlumnoDao: DatosAlumnoDao,
    private val cargaAcademicaDao: CargaAcademicaDao,
    private val kardexDao: KardexDao,
    private val califcacionesUnidadesDao: CalifcacionesUnidadesDao,
    private val calificacionesFinalesDao: CalificacionesFinalesDao
) {
    suspend fun insertarAccesoAlumno(accesoAlumno: AccesoAlumno) {
        accesoAlumoDao.insertarAccesoAlumno(accesoAlumno)
    }

    suspend fun actualizarAccesoAlumno(accesoAlumno: AccesoAlumno) {
        accesoAlumoDao.actualizarAccesoAlumno(accesoAlumno)
    }

    suspend fun eliminarAccesoAlumno(accesoAlumno: AccesoAlumno) {
        accesoAlumoDao.eliminarAccesoAlumno(accesoAlumno)
    }

    suspend fun getAccesoAlumnoByMatricula(matricula: String) : AccesoAlumno? {
        return accesoAlumoDao.getAccesoAlumnoByMatricula(matricula).value
    }

    fun insertarDatosAlumno(datosAlumno: DatosAlumno) {
        datosAlumnoDao.insertarDatosAlumno(datosAlumno)
    }
    fun actualizarDatosAlumno(datosAlumno: DatosAlumno) {
        datosAlumnoDao.actualizarDatosAlumno(datosAlumno)
    }
    fun eliminarDatosAlumno(matricula: String) {
        datosAlumnoDao.eliminarDatosAlumno(matricula)
    }

    fun getDatosAlumno (matricula: String) : DatosAlumno? {
        return datosAlumnoDao.getDatosAlumno(matricula).value
    }

    fun insertarCargaAcademica(cargaAcademica: CargaAcademica) {
        cargaAcademicaDao.insertarCargaAcademica(cargaAcademica)
    }

    fun actualizarCargaAcademica(cargaAcademica: CargaAcademica) {
        cargaAcademicaDao.actualizarCargaAcademica(cargaAcademica)
    }

    fun eliminarCargaAcademica(grupo: String) {
        cargaAcademicaDao.eliminarCargaAcademica(grupo)
    }

    fun getCargaAcademicaGrupo (grupo: String) : CargaAcademica? {
        return cargaAcademicaDao.getCargaAcademicaGrupo(grupo).value
    }
    fun getAllCargaAcademica() : List<CargaAcademica>? {
        return cargaAcademicaDao.getAllCargaAcademica().value
    }

    fun insertarKardex(kardex: Kardex) {
        kardexDao.insertarKardex(kardex)
    }
    @Update
    fun actualizarKardex(kardex: Kardex) {
        kardexDao.actualizarKardex(kardex)
    }
    fun eliminarKardex(clvMat : String) {
        kardexDao.eliminarKardex(clvMat)
    }
    fun getKardexMateria(clvMat : String) : Kardex? {
        return kardexDao.getKardexMateria(clvMat).value
    }
    fun getAllKardex() : List<Kardex>? {
        return  kardexDao.getAllKardex().value
    }
    fun insertarCalificacionesUnidades(calificacionesUnidades: CalificacionesUnidades) {
        califcacionesUnidadesDao.insertarCalificacionesUnidades(calificacionesUnidades)
    }
    fun actualizarCalificacionesUnidades(calificacionesUnidades: CalificacionesUnidades) {
        califcacionesUnidadesDao.actualizarCalificacionesUnidades(calificacionesUnidades)
    }
    fun eliminarCalificacionesUnidades(grupo: String) {
        califcacionesUnidadesDao.eliminarCalificacionesUnidades(grupo)
    }
    fun getCalifcaciconesUnidades (grupo: String) : CalificacionesUnidades? {
        return califcacionesUnidadesDao.getCalifcaciconesUnidades(grupo).value
    }
    fun getAllCalificacionesUnidades() : List<CalificacionesUnidades>? {
        return califcacionesUnidadesDao.getAllCalificacionesUnidades().value
    }

    fun insertarCalificacionesFinales(calificacionFinal: CalificacionesFinales) {
        calificacionesFinalesDao.insertarCalificacionesFinales(calificacionFinal)
    }
    fun actualizarCalifcacionFinal(calificacionFinal: CalificacionesFinales) {
        calificacionesFinalesDao.actualizarCalifcacionFinal(calificacionFinal)
    }
    fun eliminarCalificacionFinal(grupo: String){
        calificacionesFinalesDao.eliminarCalificacionFinal(grupo)
    }
    fun getCalificacionFinal(grupo: String) : CalificacionesFinales? {
        return calificacionesFinalesDao.getCalificacionFinal(grupo).value
    }
    fun getAllCalificacionesFinales() : List<CalificacionesFinales>? {
        return calificacionesFinalesDao.getAllCalificacionesFinales().value
    }
}