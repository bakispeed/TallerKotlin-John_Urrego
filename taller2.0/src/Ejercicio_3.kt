fun main() {
    val fibonacci = { n: Int ->
        val lista = mutableListOf(0, 1)
        repeat(n - 2) {
            lista += lista[lista.size - 1] + lista[lista.size - 2]
        }
        lista
    }

    println(fibonacci(20))
} 