package org.example

const val PERCENT = 100f

fun main() {
    val ironOre = 11
    val cristallOre = 7
    val baff = 20
    val reformatPercent = baff / PERCENT
    val ironBaff = ironOre * reformatPercent
    val formattedIronBaff = String.format("%.0f", ironBaff)
    val cristallBaff = cristallOre * reformatPercent
    val formattedCristallBaff = String.format("%.0f", cristallBaff)
    println("$formattedIronBaff-бафф железной руды")
    println("$formattedCristallBaff-бафф кристаллической руды")
}