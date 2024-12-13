package org.example

const val MINUTES_IN_HOUR = 60

fun main() {
    val timeStartMinutes = 9 * MINUTES_IN_HOUR + 39 //579
    val finishTimeMinutes = 457 + timeStartMinutes //1036
    val hoursFinishTime = finishTimeMinutes / MINUTES_IN_HOUR //17
    val restMinutesFinishTime = finishTimeMinutes - hoursFinishTime * MINUTES_IN_HOUR
    println("$hoursFinishTime:$restMinutesFinishTime")
}