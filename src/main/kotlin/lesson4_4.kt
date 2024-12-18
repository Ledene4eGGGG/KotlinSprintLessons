package org.example

fun main() {
    var dayOfTrain = 6
    val isEvenDay = dayOfTrain % 2 == 0
    val exercisesForPress = !isEvenDay
    val exercisesForHands = !isEvenDay
    val exercisesForBack = isEvenDay
    val exercisesForFoots = isEvenDay
    println(
        "Упражнения для рук:    $exercisesForHands\n" +
                "Упражнения для ног:    $exercisesForFoots\n" +
                "Упражнения для спины:  $exercisesForBack\n" +
                "Упражнения для пресса: $exercisesForPress"
    )
}