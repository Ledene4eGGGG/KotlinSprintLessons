package org.example

private const val MIN_COUNT = 0
private const val MAX_COUNT = 42

fun main() {
    val randomCounts = MIN_COUNT..MAX_COUNT
    val generatedNumbers = listOf(
        randomCounts.random(),
        randomCounts.random(),
        randomCounts.random()
    )
    println("Введите три числа от 0 до 42:")
    val userGenerateNumbers = listOf(
        readln().toInt(),
        readln().toInt(),
        readln().toInt()
    )
    val result = generatedNumbers intersect userGenerateNumbers
    when (result.size) {
        3 -> println("Джекпот!")
        2 -> println("2 числа совпадают, крупный приз")
        1 -> println("1 число совпало, утешительный приз")
        0 -> println("Ничего не совпало, очень жаль")
    }
    println(generatedNumbers.toString())
}





