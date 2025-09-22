package Laprak1

import java.util.*

fun main(args: Array<String>) {
    // Character occurrence in a sentence analysis
    val s = """
        A programmer gets stuck in the shower 
        because the instructions on the shampoo were: 
        Lather, Wash, and Repeat.
    """.trimIndent().lowercase(Locale.getDefault())

    println(s)

    // counters initialization
    var vowelCount = 0
    var consonantCount = 0

    // definition of character groups
    val vowels = "aeiouy"
    val consonants = "bcdfghjklmnpqrstvwxz"

    // main loop
    for (c in s) {
        when {
            vowels.contains(c) -> vowelCount++
            consonants.contains(c) -> consonantCount++
        }
    }

    println("Vowels: $vowelCount")
    println("Consonants: $consonantCount")
    println("Other characters: ${s.length - (vowelCount + consonantCount)}")
}
