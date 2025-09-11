fun main() {
    val a = 10
    val b = 5
    val resultado = RestarNumeros(x = a, y = b)
    println("La Resta da: $resultado")
}

fun RestarNumeros(x: Int, y: Int): Int {
    return x - y
}
