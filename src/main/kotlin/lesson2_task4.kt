package org.example

fun main() {
    val ironOre = 11
    val cristallOre = 7
    val baff = 0.2f
    val ironBaff = ironOre * baff
    val formattedIronBaff = String.format("%.0f", ironBaff)
    val cristallBaff = cristallOre * baff
    val formattedCristallBaff = String.format("%.0f", cristallBaff)
    println("$formattedIronBaff-бафф железной руды")
    println("$formattedCristallBaff-бафф кристаллической руды")



}