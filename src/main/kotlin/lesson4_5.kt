package org.example

private const val HAS_DAMAGE = true
private const val TEAM_SIZE_MINIMAL = 50
private const val TEAM_SIZE_OPTIMAL = 70
private const val PROVISION_SIZE_MINIMAL = 50
private const val IS_GOOD_WEATHER = true

fun main() {
    val hasDamage = readln().toBoolean()
    val teamSize = readln().toInt()
    val provisionSize = readln().toInt()
    val isGoodWeather = readln().toBoolean()
    if (hasDamage == !HAS_DAMAGE &&
        teamSize in TEAM_SIZE_MINIMAL..TEAM_SIZE_OPTIMAL &&
        provisionSize > PROVISION_SIZE_MINIMAL
    ) {
        println("корабль может плыть")
    } else if (hasDamage == HAS_DAMAGE &&
        teamSize == TEAM_SIZE_OPTIMAL &&
        provisionSize >= PROVISION_SIZE_MINIMAL &&
        isGoodWeather == IS_GOOD_WEATHER
    ) {
        println("корабль может плыть")
    } else {
        println("корабль не может плыть")
    }
}