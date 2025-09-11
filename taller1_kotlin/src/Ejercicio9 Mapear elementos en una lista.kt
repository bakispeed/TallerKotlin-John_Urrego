fun main() {
    val numeros = listOf(1, 5, 8, 12, 20)

    val resultado = numeros.map { it * 2 }

    println("Lista original: $numeros")
    println("Lista multiplicada por 2: $resultado")
}
