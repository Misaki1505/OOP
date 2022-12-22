package com.example.oop

fun main(args: Array<String>) {
    val cat = Animal()
    cat.run()

    cat.name = "Kitty"
    cat.topSpeed = 40
    cat.run()
}

class Animal {
    var name = "An animal"
    var topSpeed = 0

    fun run() {
        println("$name's top speed is $topSpeed")
    }
}