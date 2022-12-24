package com.example.oop

fun main(args: Array<String>) {
    val jetpack = JetPack()
    jetpack.burn(10)
    println("User height is ${jetpack.userHeight}")
    jetpack.stop(2)
    println("User height is ${jetpack.userHeight}")
}

class JetPack {
    var userHeight = 0

    fun burn(seconds: Int) {
        println("Burning fior $seconds seconds")
        userHeight += seconds
    }

    fun stop(seconds: Int) {
        println("Stopping for $seconds seconds")
        userHeight -= 3 * seconds
        if(userHeight < 0)
            userHeight = 0
    }
}