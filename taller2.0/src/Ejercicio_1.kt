fun main (){
    val numero = readLine()?.toIntOrNull()
    if (numero != null && numero >= 0 ) {
        val factorial = { n: Int ->
            var resultado = 1
            for (i in 1..n) {
                resultado *= i
            }
            resultado
        }
        println("el factorial de $numero es ${factorial(numero)}")

    }else {
        println("Por favor ingrese un número que no sea negativo")
    }
}