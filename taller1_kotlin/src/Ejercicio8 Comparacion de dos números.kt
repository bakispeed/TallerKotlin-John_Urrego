fun main() {
    print("Ingresa el primer número: ")
    val numero1 = readLine()!!.toInt()

    print("Ingresa el segundo número: ")
    val numero2 = readLine()!!.toInt()

    if (numero1 == numero2) {
        println("Ambos números son iguales.")
    } else if (numero1 > numero2) {
        println("El primer número (${numero1}) es mayor que el segundo (${numero2}).")
    } else {
        println("El segundo número (${numero2}) es mayor que el primero (${numero1}).")
    }
}
