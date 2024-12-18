package org.example

fun main() {
    val firstCount = 10
    val secondCount = 20
    println("Введите первое число")
    val userCountFirst = readln().toInt()
    println("Введите второе число")
    val userCountSecond = readln().toInt()
    if (
        (userCountFirst == firstCount && userCountSecond == secondCount) ||
        (userCountFirst == secondCount && userCountSecond == firstCount)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (
        (userCountFirst != firstCount && userCountSecond == secondCount) ||
        (userCountFirst == firstCount && userCountSecond != secondCount)
    ) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача")
    }
    println("Ожидаемые числа: $firstCount и $secondCount")
}