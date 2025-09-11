fun main() {
    val mensaje = saludar(nombre = "Laura", edad = 25)
    println(mensaje)
}

fun saludar(nombre: String, edad: Int): String {
    return "Hola $nombre, tienes $edad años."
}
