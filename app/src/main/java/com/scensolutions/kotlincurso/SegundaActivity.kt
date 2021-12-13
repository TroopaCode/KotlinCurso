package com.scensolutions.kotlincurso

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {

    private var nombre: String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val texto = findViewById<TextView>(R.id.txtOutput)
        val boton = findViewById<Button>(R.id.btnAccion)

        intent.extras?.let { bundle ->
            nombre = bundle.getString("nombre")
        }

        boton.setOnClickListener {
            navegarMainActivity()

        }

        texto.text = nombre
    }

    private fun navegarMainActivity()
    {
        val intent = Intent()
        intent.putExtra("nombre2", "Hola desde segunda activity")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}