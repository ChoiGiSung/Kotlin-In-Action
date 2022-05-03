package com.kt.action.chapter7

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }

}

fun main() {
    var point = Point(1, 2)
    val point2 = Point(1, 2)

    point += point2 // 새로운 객체 생성. 변경하고 싶다면 plus말고 plusAssign 오버라이딩
    println(point + point2) //Point(x=2, y=4)
}
