interface Pagable {
    fun pagar()
}

class TarjetaCredito : Pagable {
    override fun pagar() {
        println("Procesando pago con tarjeta de crédito...")
    }
}

class PayPal : Pagable {
    override fun pagar() {
        println("Redirigiendo a PayPal para procesar el pago...")
    }
}

class Criptomoneda : Pagable {
    override fun pagar() {
        println("Validando transacción en la blockchain con criptomonedas...")
    }
}

class CarritoDeCompras {
    fun checkout(pago: Pagable) {
        println("Iniciando proceso de pago...")
        pago.pagar()
        println("Pago completado.")
        println()
    }
}

fun main() {
    val carrito = CarritoDeCompras()

    val tarjeta = TarjetaCredito()
    val paypal = PayPal()
    val cripto = Criptomoneda()

    carrito.checkout(tarjeta)
    carrito.checkout(paypal)
    carrito.checkout(cripto)
}
