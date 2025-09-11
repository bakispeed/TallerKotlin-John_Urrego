fun main() {
    val paisesConCapitales = listOf(
        "Colombia" to "Bogotá",
        "Japón" to "Tokio",
        "Francia" to "París",
        "Australia" to "Canberra",
        "Egipto" to "El Cairo"
    )

    println("Lista de países y sus capitales:")
    for ((pais, capital) in paisesConCapitales) {
        println("- $pais -> $capital")
    }
}
