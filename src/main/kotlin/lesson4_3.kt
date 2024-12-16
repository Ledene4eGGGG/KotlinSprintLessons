package org.example

private const val CRITERIA_SUNNY_WEATHER = true
private const val CRITERIA_OPEN_TENT = true
private const val CRITERIA_AIR_HUMIDITY = 20
private const val CRITERIA_SEASON = "не зима"

fun main() {
    val isTodayWeatherSunny = true
    val isTodayOpenTent = true
    val todayAirHumidity = 20
    val todaySeason = "зима"

    val isGoodConditions = isTodayWeatherSunny == CRITERIA_SUNNY_WEATHER &&
            isTodayOpenTent == CRITERIA_OPEN_TENT &&
            todayAirHumidity == CRITERIA_AIR_HUMIDITY &&
            todaySeason == CRITERIA_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodConditions")
}