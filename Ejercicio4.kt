open class Carta(
    val valor: Int,
    val palo: String
) {
    open fun descripcion(): String {
        return "Carta de valor $valor del palo $palo"
    }
}

class CartaNumerica(valor: Int, palo: String) : Carta(valor, palo) {
    override fun descripcion(): String {
        return "Carta Numérica: $valor de $palo"
    }
}

class CartaFigura(
    val figura: String, // J, Q, K
    palo: String
) : Carta(10, palo) { // todas las figuras valen 10
    override fun descripcion(): String {
        return "Carta Figura: $figura de $palo"
    }
}

fun compararCartas(c1: Carta, c2: Carta): Carta {
    return if (c1.valor >= c2.valor) c1 else c2
}

fun main() {
    val carta1 = CartaNumerica(7, "Corazones")
    val carta2 = CartaFigura("K", "Espadas")
    val carta3 = CartaNumerica(9, "Tréboles")
    val carta4 = CartaFigura("J", "Diamantes")

    val cartas = listOf(carta1, carta2, carta3, carta4)

    for (carta in cartas) {
        println(carta.descripcion())
    }

    val ganadora = compararCartas(carta3, carta2)
    println("La carta ganadora entre ${carta3.descripcion()} y ${carta2.descripcion()} es: ${ganadora.descripcion()}")
}
