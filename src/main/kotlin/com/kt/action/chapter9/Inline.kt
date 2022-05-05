package com.kt.action.chapter9

import java.util.*

fun main() {
    isA<String>(listOf("A"))
    val mutableListOf = mutableListOf(2)
//    addAnswer(mutableListOf) //error
//    readAnswer(mutableListOf) // ok
}

inline fun <reified T> isA(value: Any) = value is T

fun filterReified() {
    val listOf = listOf(1, "2", 3, "4")
    val filterIsInstance = listOf.filterIsInstance<String>()
    //filter -> 2,3
}

fun serviceLoader() {
    loadService<String>()
}

inline fun <reified T> loadService() = ServiceLoader.load(T::class.java)

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}

fun readAnswer(list: List<Any>) {
    for (any in list) {

    }
}
