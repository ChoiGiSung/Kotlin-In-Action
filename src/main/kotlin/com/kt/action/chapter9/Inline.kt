package com.kt.action.chapter9

fun main() {
    isA<String>(listOf("A"))
}

inline fun <reified T> isA(value: Any) = value is T

fun filterReified(){
    val listOf = listOf(1, "2", 3, "4")
    val filterIsInstance = listOf.filterIsInstance<String>()
    //filter -> 2,3
}
