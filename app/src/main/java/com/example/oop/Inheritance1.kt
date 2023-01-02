package com.example.oop

fun main(args: Array<String>) {
    val myLaptop = Laptop()
    val myApple = Apple()
    myApple.screenSize = 13
    myApple.name = "Apple macbook"

    myLaptop.run()
    myApple.run()

}

open class Laptop {
    var screenSize = 15
    var speed = 1200
    var name = "generic laptop"

    fun run() {
        println("Running Laptop with screen size $screenSize and speed $speed")
    }
}

class Apple: Laptop() {
}