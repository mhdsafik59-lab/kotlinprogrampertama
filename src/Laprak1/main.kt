package Laprak1

fun main() {
    // contoh input Morse (pisah tiap karakter dengan spasi; "/" artinya spasi antar kata)
    val s = ".. -.-. - ... --- -.-. .. .- .-.." 
    println("The original message: $s")

    // map dari kode Morse -> karakter
    val morseToChar = mapOf(
        ".-"    to 'a', "-..." to 'b', "-.-." to 'c', "-.."  to 'd', "."    to 'e',
        "..-."  to 'f', "--."  to 'g', "...." to 'h', ".."   to 'i', ".---" to 'j',
        "-.-"   to 'k', ".-.." to 'l', "--"   to 'm', "-."   to 'n', "---"  to 'o',
        ".--."  to 'p', "--.-" to 'q', ".-."  to 'r', "..."  to 's', "-"    to 't',
        "..-"   to 'u', "...-" to 'v', ".--"  to 'w', "-..-" to 'x', "-.--" to 'y',
        "--.."  to 'z',
        ".----" to '1', "..---" to '2', "...--" to '3', "....-" to '4', "....." to '5',
        "-...." to '6', "--..." to '7', "---.." to '8', "----." to '9', "-----" to '0'
    )

    val tokens = s.trim().split(" ")
    val decoded = StringBuilder()

    for (token in tokens) {
        when {
            token == "/" -> decoded.append(' ')            // pemisah kata
            token.isEmpty() -> { /* abaikan */ }          // kalau ada spasi ganda
            else -> {
                val ch = morseToChar[token]
                if (ch != null) decoded.append(ch)
                else decoded.append('?') // token tak dikenal -> tanda tanya
            }
        }
    }

    println("Decoded message: ${decoded.toString()}")
}
