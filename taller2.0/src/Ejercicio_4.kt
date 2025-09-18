class Persona(val nombre: String, val edad: Int) {
    // Lambda para mostrar la información
    val mostrarInfo: () -> String = {
        "Nombre: $nombre, Edad: $edad"
    }
}

fun main() {
    val persona1 = Persona("Ana", 28)
    val persona2 = Persona("Luis", 35)

    println(persona1.mostrarInfo())
    println(persona2.mostrarInfo())
}