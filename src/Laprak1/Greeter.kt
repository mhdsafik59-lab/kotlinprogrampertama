package Laprak1

class Greeter {
    var text: String = ""

    // Metode ini tidak diubah dari versi awal Anda,
    // tetapi bisa dihapus jika tidak diperlukan lagi.
    fun greet() {
        println("Hello object world!")
    }

    // Metode greet dengan satu parameter String
    fun greet(name: String) {
        println("$text $name")
    }

    // Metode with_ret_val dengan satu parameter String dan nilai kembali String
    fun with_ret_val(name: String): String {
        return "$text $name"
    }
}