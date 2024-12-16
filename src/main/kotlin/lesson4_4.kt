package org.example

fun main() {
    val dayOfTrain = 6
    val exercisesForPress = true
    val exercisesForHands = true
    val exercisesForBack = false
    val exercisesForFoots = false
    println(
        if (dayOfTrain % 2 == 1) {
                    "Упражнения для рук:    $exercisesForHands\n" +
                    "Упражнения для ног:    $exercisesForFoots\n" +
                    "Упражнения для спины:  $exercisesForBack\n" +
                    "Упражнения для пресса: $exercisesForPress"
        } else {
                    "Упражнения для рук:    ${!exercisesForHands}\n" +
                    "Упражнения для ног:    ${!exercisesForFoots}\n" +
                    "Упражнения для спины:  ${!exercisesForBack}\n" +
                    "Упражнения для пресса: ${!exercisesForPress}"
        }
    )
}