package org.example

fun main() {
    var whereFrom = "E2"
    var where = "E4"
    var stepNumber = 1
    println("$whereFrom-$where;$stepNumber")
    whereFrom = "D2"
    where = "D3"
    stepNumber++
    println("$whereFrom-$where;$stepNumber")
}