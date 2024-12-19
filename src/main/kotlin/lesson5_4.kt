package org.example

private const val registeredUserName = "Zaphod"
private const val registeredUserPassword = "PanGalactic"

fun main() {
    println("Введите имя пользователя:")
    val nameUser = readln()
    if (nameUser != registeredUserName) {
        println("Пользователь не найден, зарегистрируйтесь")
    } else if (nameUser == registeredUserName) {
        println("Введите пароль:")
        val passwordUser = readln()
        if (passwordUser == registeredUserPassword) {
            println("Добро пожаловать")
        } else if (passwordUser != registeredUserPassword) {
            println("Неудача")
        }
    }
}