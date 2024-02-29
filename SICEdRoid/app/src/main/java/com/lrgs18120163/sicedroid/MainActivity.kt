package com.lrgs18120163.sicedroid
import com.lrgs18120163.sicedroid.data.DefaultAppContainer
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.google.gson.Gson
import com.lrgs18120163.sicedroid.model.AccesoAlumno
import com.lrgs18120163.sicedroid.model.DatosAlumno
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.text.SimpleDateFormat

class MainActivity : ComponentActivity() {

    private val repositorio = DefaultAppContainer(this).repositorio
    private lateinit var gson : Gson
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        GlobalScope.launch {
            try {
                val accesoAlumno = repositorio.getAcceso("","", "ALUMNO")
                gson = Gson()
                val aAlumno = gson.fromJson(accesoAlumno, AccesoAlumno::class.java)
                if (aAlumno.acceso) {
                    mostrarMensaje(applicationContext,
                        "Matricula: ${aAlumno.matricula}," +
                                "Estatus: ${aAlumno.estatus}," +
                                "Tipo de Usuario: ${aAlumno.tipoUsuario}")

                    val datosAlumno = repositorio.getAlumnoAcademicoWithLineamiento()
                    val dAlumno = gson.fromJson(datosAlumno, DatosAlumno::class.java)
                    val sdf = SimpleDateFormat("dd/MM/yyyy|HH:mm")
                    val fecha = sdf.parse(dAlumno.fechaReins)
                    mostrarMensaje(applicationContext,
                            "Carrera: ${dAlumno.carrera}, Semestre: ${dAlumno.semActual}"
                        )


                }
            } catch (e: Exception){
                Log.e("Error:", "${e.message}")
            }
        }
    }

    suspend fun mostrarMensaje(context: Context, mensaje: String) {
        withContext(Dispatchers.Main) {
            Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show()
        }
    }
}