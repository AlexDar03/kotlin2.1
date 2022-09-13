package ru.netology

fun main() {
    val mount = 1000
    val comission  = if (mount * 0.075 > 35) mount * 0.075 else 35
    println(comission)
}