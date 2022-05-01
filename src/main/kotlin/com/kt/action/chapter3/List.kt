package com.kt.action.chapter3

class List {

    fun makeList() {
        val numbers = listOf(1, 13, 15)
        val numbersSet = setOf(1, 13, 15)
        numbers.last()
    }

    fun <T> joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
    ): String {
        val builder = StringBuilder(prefix)

        for ((index, element) in collection.withIndex()) {
            if (index > 0) builder.append(separator)
            builder.append(element)
        }

        builder.append(postfix)
        return builder.toString()
    }
}

fun main(args: Array<String>) {
    val customList: List = List()

    customList.joinToString(listOf<String>(), separator = "", "m", postfix = "")
}
