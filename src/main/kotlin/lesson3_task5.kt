package org.example

fun main() {
    val str = "D2-D4;0"
    val parts = str.split('-',';')
    println("откуда - " + parts[0])
    println("куда - " + parts[1])
    println("номер хода - " + parts[2])
}