package com.kt.action.chapter5

import com.kt.action.chapter3.joinToString
import java.io.File

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("철수", 1), Person("영희", 2))

    println(people.maxByOrNull { it.age })

    val sum = { x: Int, y: Int -> x + y }

    println(sum(1, 2))
    run { println(sum(1, 2)) }

    layLoading()
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

fun flatMap() {
    class Book(val title: String, val authors: List<String>)

    val books = listOf(Book("책1", listOf("저자1", "저자2")))

    books.flatMap { it.authors }.toSet()

}

fun layLoading() {
    val people = listOf(Person("철수", 1), Person("영희", 2))
    people.asSequence()
        .map(Person::name)
        .filter { it.startsWith("철") }
        .toList()

    val find = listOf(1, 2, 3, 4).asSequence()
        .map { it * it }
        .find { it > 3 }

    print("find = $find")

    val find1 = listOf(1, 2, 3, 4)
        .map { it * it }
        .find { it > 3 }

    print("find = $find1")


}

fun File.isInsideHidden() =
    generateSequence(this) { it.parentFile }.any { it.isHidden }
