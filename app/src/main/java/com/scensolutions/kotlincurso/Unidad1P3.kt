package com.scensolutions.kotlincurso

fun main()
{
    //Funciones
    println(esPar(3))


}

//funcion nombreFuncion (Valores de parametro) : Tipo Dato return
fun esPar(numero: Int) : Boolean {
    return numero %2 == 0
}

fun ControlesFlujo()
{
    //------------------------------------   If      -------------------------------------------
    val a = 1
    val b = 2
    var max = a
    //if(a<b) max = b else max = a (Forma 1)
    max = if(a<b) b else a
    println(max)

    // -----------------------------------------   For   ------------------------------------------
    //Lista Mutable= Lista que SI se puede modificar
    var listaMutable = mutableListOf<String>("Agustin", "Pedro", "Federico", "Arturo")
    listaMutable.add("Fernando")
    listaMutable.removeAt(2)

    //Lista Inmutable= Lista que NO se puede modificar
    var listaInmutable = listOf<String>("Auto", "Moto", "Bicicleta")
    listaInmutable.get(1)

    for(nombre in listaMutable){
        println(nombre)
    }

    for((index, value) in listaMutable.withIndex()) {
        println("Nombre: $value con índice: $index")
    }

    listaMutable.forEach { elementos->
        println(elementos)
    }

    listaInmutable.forEachIndexed { index, elementos ->
        println("Nombre: $elementos con índice: $index")
    }

    // --------------------------------------- When (Switch en Java) ------------------------------
    val x= 2
    when(x){
        1-> {println("X es 1")}
        2-> {println("X es 2")}
        3-> {println("X es 3")}
        else -> {println("X no corresponde a ninguna función declarada")}
    }

    // ------------------------------ While y Do While ---------------------------------------------

    var i = 1
    while (i<=5){
        println("Valor $i")
        ++i
    }

    var sum = 0
    var input: String
    do {
        print("Ingresar un número: ")
        input = readLine()!!
        sum += input.toInt()
    }while(input!= "0")
    println("Suma= $sum")
}