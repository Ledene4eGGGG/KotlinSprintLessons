package org.example

fun main() {
    val firstCount = (1..9).random()
    val secondCount = (1..9).random()
    println("Для входа решите пример: $firstCount + $secondCount = ")
    val userResponse = readln().toInt()
    val resultOfSum = firstCount + secondCount
    if(userResponse == resultOfSum) {
        println("Добро пожаловать")
    } else {
        println("Доступ запрещен")
    }
}
