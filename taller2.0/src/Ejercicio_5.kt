// Clase base
open class Personaa(val nombre: String, val edad: Int)

// Clase derivada con atributo adicional y lambda como método
class Estudiante(nombre: String, edad: Int, val calificacion: Double) : Personaa(nombre, edad) {

    // Lambda que devuelve la información del estudiante
    fun mostrar(): String {
        val info = { "Estudiante: $nombre | Edad: $edad | Calificación: $calificacion" }
        return info()
    }
}

fun main() {
    val estudiante1 = Estudiante("Sofía", 19, 4.8)
    val estudiante2 = Estudiante("Mateo", 21, 3.9)

    println(estudiante1.mostrar())
    println(estudiante2.mostrar())
}