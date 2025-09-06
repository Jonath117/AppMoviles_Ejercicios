

//esta clase especial me permite representar un conjunto de constantes fijas
enum class Genero{
    Masculino,
    Femenino
}

fun main() {
    var nombre: String = "Jonathan Enzo"
    var apellido: String = "Rocha Contreras"

    var peso: Int = 74
    var altura: Double = 1.72
    var edad: Int = 20

    var esPrimo: Boolean = edad % 2 == 0
    var mensajeEsPrimo: String
    if(esPrimo == true){
        mensajeEsPrimo = "tu edad es un numero primo"
    }
    else {
        mensajeEsPrimo = "tu edad no es un numero primo"
    }

    val miGenero: Genero = Genero.Masculino
    val miGenero2: Genero = Genero.Femenino

    println("Hola $nombre $apellido \n Tu peso es: $peso kg \n Tu altura es: $altura m \n Tu genero es: $miGenero \n Tienes: $edad años, $mensajeEsPrimo ")

}