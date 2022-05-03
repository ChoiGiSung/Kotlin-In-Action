package com.kt.action.chapter6

fun main(){
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
