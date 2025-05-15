interface Hablador {
    fun hablar()
}

class Loro : Hablador {
    override fun hablar() {
        println("¡Hola! Soy un loro parlanchín.")
    }
}

class Perro : Hablador {
    override fun hablar() {
        println("¡Guau guau!")
    }
}

class Gato : Hablador {
    override fun hablar() {
        println("Miau...")
    }
}

class Persona : Hablador {
    override fun hablar() {
        println("Buenas tardes, un gusto saludarte.")
    }
}

fun hacerHablar(hablador: Hablador) {
    hablador.hablar()
}

fun main() {
    val listaDeHabladores: List<Hablador> = listOf(
        Loro(),
        Perro(),
        Gato(),
        Persona(),
        Loro(),
        Persona()
    )

    for (ser in listaDeHabladores) {
        hacerHablar(ser)
    }
}