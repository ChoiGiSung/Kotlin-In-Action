package com.kt.action.chapter9

import java.lang.IllegalArgumentException

fun main() {
    typeErasure()
}

fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.')) {
        seq.append('.')
    }
}

fun typeErasure() {
    val listOf = listOf(1, 2)
    val mapOf = mapOf("1" to "one")

    if (listOf is List) { //List<Int> -> x
        println("리스트?")
    }

    if (mapOf is List<*>) {
        println("리스트?")
    }
}

fun castException(c: Collection<*>) {
    val list = c as? List<Int> ?: throw IllegalArgumentException("gg")
    list.sum()
}
