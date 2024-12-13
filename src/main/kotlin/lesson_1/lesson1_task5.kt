package org.example.lesson_1

private const val SECONDS_IN_MINUTE = 60
private const val MINUTES_IN_HOUR = 60

fun main() {
    val secondsInSpace: Int = 6480
    val hoursInSpace = secondsInSpace / SECONDS_IN_MINUTE / MINUTES_IN_HOUR
    val restFromMinutes = secondsInSpace % (SECONDS_IN_MINUTE * MINUTES_IN_HOUR)
    val minutesInSpace = restFromMinutes / MINUTES_IN_HOUR
    val restFromHours = restFromMinutes % MINUTES_IN_HOUR

    val formattedHours = String.format("%02d", hoursInSpace)
    val formatedSeconds = String.format("%02d", restFromHours)

    println("$formattedHours:$minutesInSpace:$formatedSeconds")
}