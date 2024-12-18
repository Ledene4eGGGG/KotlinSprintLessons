package org.example

const val AGE_OF_MAJORITY = 18
const val YEAR_NOW = 2024

fun main() {
    val userYear = readln().toInt()
    val userAge = YEAR_NOW - userYear
    if (userAge >= AGE_OF_MAJORITY) {
        println("Show special content")
    } else {
        println("Back to main screen")
    }
}