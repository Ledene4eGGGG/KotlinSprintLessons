package org.example

const val MINUTES_IN_HOUR = 60

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val timeTravelInMinutes = 457
    val finishTimeMinutes = hourOfDeparture * MINUTES_IN_HOUR + minuteOfDeparture + timeTravelInMinutes
    val hoursFinishTime = finishTimeMinutes / MINUTES_IN_HOUR
    val restMinutesFinishTime = finishTimeMinutes - hoursFinishTime * MINUTES_IN_HOUR
    println("$hoursFinishTime:$restMinutesFinishTime")
}