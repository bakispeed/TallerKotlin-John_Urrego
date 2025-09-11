fun main() {
    val a = 10
    val b = 25
    val c = 35
    val resultado = sumaTresNumeros(a, b, c)
    println("La suma es: $resultado")
}

fun sumaTresNumeros(x: Int, y: Int, z: Int): Int {
    return x + y + z
}
