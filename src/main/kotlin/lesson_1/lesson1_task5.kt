package org.example.lesson_1

fun main() {
    val secondsInSpace: Int = 6480
    val hoursInSpace = secondsInSpace / 60 /60
    var rest = secondsInSpace % (60 * 60)
    val minutesInSpace = rest / 60
    rest %= 60

    val formattedHours = String.format("%02d", hoursInSpace)
    val formatedSeconds = String.format("%02d", rest)

    println("$formattedHours:$minutesInSpace:$formatedSeconds")

}