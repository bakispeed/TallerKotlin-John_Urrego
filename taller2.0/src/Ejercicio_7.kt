fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val pares = numeros.filter { it % 2 == 0 }

    println("Números pares: $pares")
}