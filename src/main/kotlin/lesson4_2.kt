package org.example

const val MAX_WEIGHT = 100
const val MIN_WEIGHT = 35
const val MAX_VOLUME = 100

fun main() {
    var cargoWeight = 20
    var cargoVolume = 80
    println("Груз с весом $cargoWeight и обьемом $cargoVolume соответствует категории 'Average': " +
            "${cargoWeight > MIN_WEIGHT && cargoWeight <= MAX_WEIGHT && cargoVolume < MAX_VOLUME}")
    cargoWeight = 50
    cargoVolume = 100
    println("Груз с весом $cargoWeight и обьемом $cargoVolume соответствует категории 'Average': " +
            "${cargoWeight > MIN_WEIGHT && cargoWeight <= MAX_WEIGHT && cargoVolume < MAX_VOLUME}")
}