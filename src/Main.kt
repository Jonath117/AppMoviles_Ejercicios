
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
    printGenero("Helicoptero Apache H-64 de combate F22 raptor")
}