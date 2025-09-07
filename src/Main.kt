import com.sun.jdi.IntegerType

fun main() {
    val persona1 = Persona("Jonathan Enzo", "Rocha Contreras", 20, 74, 1.72, "Masculino")
    persona1.saludar("", "ev")
    persona1.presentacion()
    persona1.printGenero()

}

data class Persona(private val nombre: String, private val apellido: String, private val edad: Int, private val peso: Int, private val altura: Double, private val genero: String ){
    fun saludar(saludo: String, nombreCompleto: String) {
        var mensajeDefault: String = "Hola "

        if(saludo.isBlank()) {
            print("$nombre dice: $mensajeDefault")
        } else {
            print(saludo)
        }
        return println(nombreCompleto)
    }

    private fun esPrimo(): String{
        if(edad <= 1){
            return "tu edad no es un numero primo"
        }
        if(edad == 2){
            return "tu edad es un numero primo"
        }
        if(edad % 2 == 0){
            return "tu edad no es un numero primo"
        }
        var i: Int = 3
        while(i * i <= edad){
            if(edad % i == 0){
                return "tu edad no es un numero primo"
            }
            i += 2
        }
        return "tu edad es un numero primo"

    }

    fun presentacion(){
        println("Hola soy $nombre $apellido \n Tu peso es: $peso kg \n Tu altura es: $altura m \n Tienes: $edad años, ${esPrimo()} ")
    }

    fun printGenero() {
        println("Mi genero es: $genero")
    }
}