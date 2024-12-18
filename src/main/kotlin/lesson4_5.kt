package org.example

fun main() {
    val hasDamage = readln().toBoolean()
    val teamSize = readln().toInt()
    val provisionSize = readln().toInt()
    val isGoodWeather = readln().toBoolean()
    if (hasDamage == false &&
        teamSize in 50..70 &&
        provisionSize > 50
    ) {
        println("корабль может плыть")
    } else if (hasDamage == true &&
        teamSize == 70 &&
        provisionSize >= 50 &&
        isGoodWeather == true
    ) {
        println("корабль может плыть")
    } else {
        println("корабль не может плыть")
    }
}