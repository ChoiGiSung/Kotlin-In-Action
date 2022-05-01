package com.kt.action.chapter5

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("철수", 1), Person("영희", 2))

    println(people.maxByOrNull { it.age })
}
