

// 1. FINAL → mencegah pewarisan
class FinalClass {
    fun show() {
        println("Ini kelas FINAL → tidak bisa diwarisi")
    }
}

// 4. ABSTRACT → kelas belum lengkap, wajib diwarisi
abstract class AbstractClass {
    abstract fun run()  // belum ada isi → wajib diisi oleh anak
}

// Subclass pertama
class SubAbstract : AbstractClass() {
    override fun run() {
        println("Implementasi run() di SubAbstract")
    }
}

// Subclass kedua
class AnotherSubAbstract : AbstractClass() {
    override fun run() {
        println("Implementasi run() di AnotherSubAbstract")
    }
}

class Ejaks : AbstractClass() {
    override fun run() {
        println("aku adalah saya dan saya adalah gua")
    }

}
class Apri : AbstractClass() {
        override fun run() {
            println("saya paham , nama saya apri")
        }
}




    // ---------------- MAIN FUNCTION ----------------
    fun main() {
        // FINAL
        val f = FinalClass()
        f.show()
        println("-----")

        // ABSTRACT
        val a = SubAbstract()
        a.run()     // output: Implementasi run() di SubAbstract
        println("-----")

        // ABSTRACT
        val b = AnotherSubAbstract()
        b.run()     // output: Implementasi run() di AnotherSubAbstract
        println("-----")

        val c = Ejaks()
        c.run()     // output: Implementasi run() di Ejaks
        println("-----")

        val d = Apri()
        c.run()     // output: Implementasi run() di Ejaks
        println("-----")
    }







// Induk pakai OPEN
/*open class Hewan {
    open fun suara() {
        println("Hewan umum bersuara")
    }
}

class Burung : Hewan()


class Kucing : Hewan() {
    override fun suara() {
        println("Meow meow")
    }
}

class Anjing : Hewan() {
    override fun suara() {
        println("Guk guk")
    }
}

fun main() {
    val h = Hewan()
    h.suara()     // Hewan umum bersuara

    val b = Burung()
    b.suara()     // tetap Hewan umum bersuara (tidak override)

    val k = Kucing()
    k.suara()     // Meow meow (override)

    val a = Anjing()
    a.suara()     // Guk guk (override)
}

*/


