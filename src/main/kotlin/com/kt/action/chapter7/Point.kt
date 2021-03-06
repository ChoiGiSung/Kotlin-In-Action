package com.kt.action.chapter7

import java.lang.IndexOutOfBoundsException
import java.math.BigInteger

data class Point(val x: Int, val y: Int) : Comparable<Point> {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

    operator fun unaryMinus(): Point {
        return Point(-x, -y)
    }

    override fun compareTo(other: Point): Int {
        return compareValuesBy(this, other, Point::x, Point::y)
    }

    operator fun contains(p: Point): Boolean {
        return p.x in x until y
    }

    operator fun get(input: Int): Int {
        return when (input) {
            0 -> x
            1 -> y
            else -> throw IndexOutOfBoundsException("초과")
        }
    }

}

fun BigInteger.inc() = this + BigInteger.ONE

fun main() {
    var point = Point(1, 2)
    val point2 = Point(1, 2)

    point += point2 // 새로운 객체 생성. 변경하고 싶다면 plus말고 plusAssign 오버라이딩
    println(point + point2) //Point(x=2, y=4)


    println(point > point2)
    println(point in point2)
    println(point[1])

    val (x,y) = point
}
