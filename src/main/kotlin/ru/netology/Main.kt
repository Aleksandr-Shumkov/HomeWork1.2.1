package ru.netology

fun main() {
    var amount = 4000
    var comission = 35.0
    val amountMax = 6000
    val step = 500
    val commissionPercentage = 0.75

    while (amount <= amountMax) {
        println("За перевод " + amount + " руб. ваша комиссия составит: " +
                if (amount * commissionPercentage / 100 < comission) comission else amount * commissionPercentage / 100)
        amount += step
    }
}