package com.example.oop

fun main(args: Array<String>) {
    val math = Math()
    println("3 + 5 = ${math.add(3, 5)}")
    println("2 * 8 = ${math.mul(2,8)}")
    println("6 - 15 = ${math.sub(6,15)}")
    println("9 / 3 = ${math.div(9,3)}")
}

class Math {
    fun add(a: Int, b: Int): Int = a + b
    fun sub(a: Int, b: Int): Int = a - b
    fun mul(a: Int, b: Int): Int = a * b
    fun div(a: Int, b: Int): Int = a / b
}