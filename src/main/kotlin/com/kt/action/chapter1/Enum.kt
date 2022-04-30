package com.kt.action.chapter1

import java.lang.Exception

class Enum {

}

enum class Color(
    val r: Int,
    val g: Int
) {

    RED(10, 0),
    BLUE(10, 0),
    ORANGE(0, 10);

    fun getMnemonic(color: Color) =
        when (color) {
            RED -> "asd"
            ORANGE -> "asdd"
            RED,ORANGE,BLUE -> "cold"

        }

    fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, ORANGE) -> RED
            setOf(RED, BLUE) -> ORANGE
            else -> throw Exception("없음")
        }

    fun mixOptimized(c1: Color,c2: Color) =
        when
        {
            (c1 == RED && c2 == ORANGE) -> ORANGE
            (c1 == RED && c2 == BLUE) -> RED
            else -> throw Exception("없음")
        }

}
