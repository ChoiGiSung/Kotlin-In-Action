package com.kt.action.chapter3

fun <T> joinToString(
    collection: Collection<T>,
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String {
    val builder = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) builder.append(separator)
        builder.append(element)
    }

    builder.append(postfix)
    return builder.toString()
}
