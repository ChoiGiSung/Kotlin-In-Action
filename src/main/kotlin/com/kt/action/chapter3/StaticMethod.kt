@file:JvmName("패키지 이름 변경")

package com.kt.action.chapter3

const val SAMPLE = "asd"

fun <T> Collection<T>.joinToString(
    separator: String = ",",
    prefix: String = "",
    postfix: String = ""
): String {
    val builder = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) builder.append(separator)
        builder.append(element)
    }

    builder.append(postfix)
    builder.append(SAMPLE)
    return builder.toString()
}

fun String.lastChar(): Char = this.get(this.length - 1)

var StringBuilder.lastChars: Char
    get() = get(length - 1)
    set(vale: Char) {
        setCharAt(length - 1, vale)
    }

fun main(args: Array<String>) {
    println("asd".lastChar())
    //listof는 vararg 매개변수이다
    val list = listOf("asd", *args)

    // to는 중위 호출
    val pair = 1.to("asd")
    val pairTo = 1 to "asd"
    //위와 같은 호출을 구조 분해 선언
}
