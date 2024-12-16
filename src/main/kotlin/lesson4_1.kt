package org.example

const val COUNT_OF_TABLES = 13

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    val freeTablesToday : Boolean = reservedTablesToday < COUNT_OF_TABLES
    val freeTablesTomorrow : Boolean = reservedTablesTomorrow < COUNT_OF_TABLES
    println("доступность столиков на сегодня: $freeTablesToday,\nдоступность столиков на завтра: $freeTablesTomorrow.")
}