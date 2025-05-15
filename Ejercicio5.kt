abstract class Instrumento {
    abstract fun tocar()
}

interface Afinable {
    fun afinar()
}

class Guitarra : Instrumento(), Afinable {
    override fun tocar() {
        println("Rasgueando las cuerdas de la guitarra...")
    }

    override fun afinar() {
        println("Afinando la guitarra...")
    }
}

class Piano : Instrumento() {
    override fun tocar() {
        println("Tocando las teclas del piano...")
    }
}

class Violin : Instrumento(), Afinable {
    override fun tocar() {
        println("Deslizando el arco del violín...")
    }

    override fun afinar() {
        println("Afinando el violín...")
    }
}

fun interpretarMelodia(instrumentos: List<Instrumento>) {
    for (instrumento in instrumentos) {
        if (instrumento is Afinable) {
            instrumento.afinar()
        }
        instrumento.tocar()
    }
}

fun main() {
    val guitarra = Guitarra()
    val piano = Piano()
    val violin = Violin()

    val orquesta = listOf<Instrumento>(guitarra, piano, violin)

    interpretarMelodia(orquesta)
}