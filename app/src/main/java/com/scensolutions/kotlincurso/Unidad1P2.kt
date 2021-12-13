package com.scensolutions.kotlincurso


fun main() {
    //Data class
    val usuario = User("Gerardo", 25)
    val usuario2 = usuario.copy(edad = 20) //Se copian los elementos de usuario, y se modifica la edad
    println(usuario.toString())
    println("Son iguales:  ${usuario == usuario2}")

    //Constantes
    println(Constantes.direccion)

    //Enum Class
    println(DIAS.DOMINGO.numero)
}

//Al usar un data class, tienes acceso a los métodos de copy, equals, hashcode y toString()
data class User(val nombre:String, val edad: Int)


//Constantes
const val direccion = "25 de julio"

class Constantes {
    companion object { //Equivalente a public static final en Java
        const val direccion = "25 de julio"
    }
}

//Enum Clases
enum class DIAS(val numero: Int) {
    LUNES(1),
    MARTES(2),
    MIERCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7)
}
