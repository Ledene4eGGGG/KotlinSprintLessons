package org.example

import kotlin.math.pow

fun main() {
    val money = 70000
    val percentBet = 16.7
    val periodDeposit = 20
    val amountDeposit = money * (
            1 + percentBet / 100.00).pow(periodDeposit)
    val formatedAmountDeposit = String.format("%.3f", amountDeposit)
    println(formatedAmountDeposit)
}
