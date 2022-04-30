package com.kt.action.chapter1

class Rectangle(
    val height: Int,
    val width: Int
) {
    val isSquare: Boolean
        get() {
            return height == width
        }

    fun isSquareFun(): Boolean {
        return height == width
    }
}

fun main(args: Array<String>) {
    val rectangle: Rectangle = Rectangle(1, 2)

    rectangle.isSquare
    rectangle.isSquareFun()
}
