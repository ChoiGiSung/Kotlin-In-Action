@file:JvmName("패키지 이름 변경")

package com.kt.action.chapter3

const val SAMPLE = "asd"

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
    builder.append(SAMPLE)
    return builder.toString()
}

fun String.lastChar(): Char = this.get(this.length - 1)

fun main(args:Array<String>){
    println("asd".lastChar())
}
