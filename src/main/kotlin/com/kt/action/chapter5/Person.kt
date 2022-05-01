package com.kt.action.chapter5

import com.kt.action.chapter3.joinToString

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("철수", 1), Person("영희", 2))

    println(people.maxByOrNull { it.age })

    val sum = { x: Int, y: Int -> x + y }

    println(sum(1, 2))
    run { println(sum(1, 2)) }
}

fun lambdaJoinToString() {
    val people = listOf(Person("철수", 1), Person("영희", 2))

    people.joinToString(
        " ",
        transform = { person: Person -> person.name }
    )

    people.joinToString("") { person: Person -> person.name }
    people.joinToString("") { it.name }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0

    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
}
