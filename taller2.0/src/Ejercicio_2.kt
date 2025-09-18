fun main() {
    val numeros = mutableListOf<Double>()

    println("Ingresa números uno por uno. Escribe 'fin' para terminar:")

    while (true) {
        val entrada = readLine()
        if (entrada == "fin") break

        val numero = entrada?.toDoubleOrNull()
        if (numero != null) {
            numeros.add(numero)
        } else {
            println("Entrada inválida.")
        }
    }

    val promedio = { lista: List<Double> ->
        if (lista.isNotEmpty()) lista.sum() / lista.size else 0.0
    }

    println("El promedio es: ${promedio(numeros)}")
}