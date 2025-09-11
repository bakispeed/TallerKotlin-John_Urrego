fun main() {
    println("Ingrese el número: ")
    val numero = readLine()!!.toInt()

    when {
        numero < 0 -> println("Negativo")
        numero == 0 -> println("Cero")
        else -> println("Positivo")
    }
}
