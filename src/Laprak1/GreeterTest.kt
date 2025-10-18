package Laprak1

fun main() {
    val greeter = Greeter()
    // Memanggil metode greet() tanpa parameter dari permintaan awal Anda
    greeter.greet()

    // Memberikan nilai "Hi" pada atribut text
    greeter.text = "Hi"

    // Memanggil metode greet dengan parameter "Anton" dan "Budi"
    greeter.greet("Anton")
    greeter.greet("Budi")

    // Mengubah nilai atribut text menjadi "Hello programmer"
    greeter.text = "Hello programmer"

    // Memanggil fungsi with_ret_val dan mencetak hasilnya
    println(greeter.with_ret_val("Dono"))
}