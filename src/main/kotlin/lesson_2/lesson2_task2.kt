package org.example.lesson_2

fun main() {
    val countWorkers = 50
    val workerSalary = 30000
    val countInterns = 30
    val internSalary = 20000
    val paymentOfWorkers = countWorkers * workerSalary
    val paymentOfInterns = countInterns * internSalary
    val allPayments = paymentOfWorkers + paymentOfInterns
    val averageSalary = allPayments / (countWorkers + countInterns)
    println(paymentOfWorkers)
    println(allPayments)
    println(averageSalary)
}
