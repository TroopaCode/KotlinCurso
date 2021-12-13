package com.scensolutions.kotlincurso

class Unidad1 {

}

fun main()
{
    //Clases
    //val persona: Persona = Persona("Gerardo", "Viveros")
    val persona = Persona("Gerardo", "Viveros")
    val persona2 = Persona("", "")
}

fun variables()
{
    //Java
    /*int a = 2;
    a = 5
    final int b = 3;
    int c = a + b;*/

    //Kotlin
    var a: Int = 2;
    a = 5
    val b: Int = 3;
    var c: Int = a + b
    println(c)
}

//Al agregar el valor "", son valores para hacer un constructor vacío
class Persona(private val nombre:String ="", private val apellido:String =""){
    fun darBienvenida()
    {
        println("Bienvenido $nombre $apellido")
    }
}