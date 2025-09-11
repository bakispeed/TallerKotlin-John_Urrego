fun main() {
    println("Ingresa un número: ")
    val numero = readLine()!!.toInt()

    if (numero % 2 == 0) {
        println("El número $numero es PAR.")
    } else {
        println("El número $numero es IMPAR.")
    }
}
