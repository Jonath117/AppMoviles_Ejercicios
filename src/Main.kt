
fun saludar(saludo: String, nombreCompleto: String) {
    var mensajeDefault: String = "Hola"

    if(saludo.isBlank()) {
        print(mensajeDefault)
    } else {
        print(saludo)
    }
    return println(" $nombreCompleto")
}

fun printGenero(genero: String) {
    println("Mi genero es: $genero")
}


fun main() {
    saludar("","Jonathan")
    //Hola Jonathan

    saludar("Buenas noches","Jonathan Enzo")
    //Buenas noches Jonathan Enzo

    printGenero("Helicoptero Apache H-64 de combate F22 raptor")
    //Mi genero es: Helicoptero Apache H-64 de combate F22 raptor

    printGenero("Masculino")
    //Mi genero es: Masculino
}