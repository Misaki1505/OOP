package com.example.oop

fun main(args: Array<String>) {
    val animal: ArrayList<String> = arrayListOf<String>()
    val table = Table()
    print(table.color)
}

class Table {
    var color: String = "white"
}