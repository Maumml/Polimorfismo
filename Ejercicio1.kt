// Clase abstracta que define un contrato para las figuras
abstract class FiguraGeometrica {
    abstract fun calcularArea(): Double
    abstract fun calcularPerimetro(): Double
}

// Subclase: Cuadrado
class Cuadrado(private val lado: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return lado * lado
    }

    override fun calcularPerimetro(): Double {
        return 4 * lado
    }
}

// Subclase: Círculo
class Circulo(private val radio: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return Math.PI * radio * radio  // πr²
    }

    override fun calcularPerimetro(): Double {
        return 2 * Math.PI * radio  // 2πr
    }
}

// Subclase: Rectángulo
class Rectangulo(private val base: Double, private val altura: Double) : FiguraGeometrica() {
    override fun calcularArea(): Double {
        return base * altura
    }

    override fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }
}

// Función principal
fun main() {
    val figuras = listOf<FiguraGeometrica>(
        Circulo(5.0),
        Rectangulo(4.0, 3.0),
        Cuadrado(6.0)
    )

    for (figura in figuras) {
        println("Área: ${figura.calcularArea()} | Perímetro: ${figura.calcularPerimetro()}")
    }
}