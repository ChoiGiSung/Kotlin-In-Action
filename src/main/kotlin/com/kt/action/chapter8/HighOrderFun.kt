package com.kt.action.chapter8

fun main() {
    "abv".filter { it in 'a'..'z' }
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

data class Order(val item: Int)

fun getCostCalculator(): (Order) -> Double {
    return { order -> 1.2 * order.item }
}
