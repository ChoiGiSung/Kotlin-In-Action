package com.kt.action.chapter6

fun main() {
    autoBoxing()
}


fun IntType() {
    val intType: Int = 3
    val intTypeNullAble: Int? = 3
    val intCollection = listOf(1, 2, 3)
}

fun autoBoxing() {
    val x = 1;
    val list = listOf(1L, 2L, 3L)

//    x in list error
    x.toLong() in list

    val l = 1L + 1
    println(l.javaClass)
}

fun unit(): Unit {

}

fun nothing(): Nothing {
    while (true) {
        println("gg")
    }
}

fun list() {
    mapOf<String, Int>()
    mutableMapOf<String, Int>()
}

fun array() {
    val array = Array<String>(26) { i -> ('a' + i).toString() }
    println("%s/%s/%s".format(*listOf("a").toTypedArray()))

    val intArray = IntArray(6)
    intArray.forEachIndexed() { index: Int, i: Int ->
        println(index)
    }
}
