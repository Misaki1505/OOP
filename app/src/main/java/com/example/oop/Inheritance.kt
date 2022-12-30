package com.example.oop

fun main(args: Array<String>) {
    val myDog = Corgi()
    myDog.size = 10
    println(myDog.size)
    myDog.bark()
    myDog.play()
}

open class Dog {
    var size = 0

    fun bark() {
        println("Bark")
    }

    fun play() {
        println("Play")
    }
}

class Corgi: Dog() {

}