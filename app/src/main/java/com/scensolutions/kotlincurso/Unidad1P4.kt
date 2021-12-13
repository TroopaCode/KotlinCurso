package com.scensolutions.kotlincurso

import java.util.*

fun main(){
    //-------------------------  Extension Functions  --------------------------------------------
    val nombre = "Gerardo"
    println(nombre.lowercase(Locale.getDefault()))
    val numero = 10
    println(numero.toString())
    println("Remover primer caracter: ${nombre.removerPrimerCaracter()}")


    // ---------------------------- Nullabilidad --------------------------------------------------
    val nom: String? = null
    //println(nom!!.length) //Declara explícitamente que este valor no es null (!!)
    val c = nom?.length ?: "Leo".length //Elvis Operator (?:): Ejecuta la otra opcion si la primera es null
    nom?.let { //Solo entra a "let" si la variable no es nula
        println(it)
    }
    println(c)

    //--------------------------- Genéricos -------------------------------------------------
    //Elemento("Gerardo")
    Elemento(PersonaFormal("Gerardo", "Viveros", 25), "test valor 2")
}

//Extension Functions
fun String.removerPrimerCaracter(): String = this.substring(1)

//---------------- Introducción a Genéricos -------------------------------------
data class PersonaFormal(val nombre: String, val apellido: String, val edad: Int)

class Elemento<T, R>(value: T, value2: R)
{
    init {
        println("El valor es $value y $value2")
    }
}