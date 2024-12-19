package org.example

private const val registeredUserName = "Zaphod"
private const val registeredUserPassword = "PanGalactic"

fun main() {
    println("Введите имя пользователя")
    val nameUser = readln()
    if (nameUser != registeredUserName) {
        println("Пожалуйста зарегистрируйтесь")
    } else if (nameUser == registeredUserName) {
        println("Пожалуйста введите пароль")
    }
    val passwordUser = readln()
    if (passwordUser == registeredUserPassword) {
        println("Добро пожаловать на наш корабль")
    } else println("Пароль не подходит")
}