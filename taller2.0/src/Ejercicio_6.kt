// Definición de la interfaz
interface Operaciones {
    fun sumar(a: Int, b: Int): Int
    fun restar(a: Int, b: Int): Int
}

// Implementación de la interfaz en una clase
class Calculadora : Operaciones {
    override fun sumar(a: Int, b: Int): Int = a + b
    override fun restar(a: Int, b: Int): Int = a - b
}

fun main() {
    val calc = Calculadora()

    println("Suma: ${calc.sumar(10, 5)}")     // Imprime: Suma: 15
    println("Resta: ${calc.restar(10, 5)}")   // Imprime: Resta: 5
}