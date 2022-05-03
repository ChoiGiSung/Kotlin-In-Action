package com.kt.action.chapter6

fun main() {
    val listOf = listOf("민수")
    listOf[0]?.let { sendEmail(it) }
}

fun sendEmail(email: String) {
    println("$email")
}

fun isNullOrEmpty(input: String?) {
    println(input?.toString())
    println(input.isNullOrEmpty())
}

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}


fun <T : Any> printHashCodeAny(t: T) {
    println(t.hashCode())
}
