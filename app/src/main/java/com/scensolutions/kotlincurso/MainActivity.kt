package com.scensolutions.kotlincurso

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //El lateinit promete que esa variable será inicializada antes de su uso
    private lateinit var texto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Lyfecycle", "onCreate")
        val texto = findViewById<TextView>(R.id.txtOutput)
        val boton = findViewById<Button>(R.id.btnAccion)

        boton.setOnClickListener {
            texto.text = "Curso Android"
            navegarSegundaActivity()
        }
    }

    private fun navegarSegundaActivity()
    {
        val intent = Intent(this, SegundaActivity::class.java)
        intent.putExtra("nombre", "Curso Android")
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                val nombre = data?.getStringExtra("nombre2")
                texto.text = nombre
            }
        }
    }

   /* override fun onStart() {
        super.onStart()
        Log.d("Lyfecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lyfecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lyfecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lyfecycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lyfecycle", "onDestroy")
    }*/
}