package com.kt.action.chapter6

fun sendEmail(email: String) {
    println("$email")
}

fun main() {
    val listOf = listOf("민수")
    listOf[0].let { sendEmail(it) }
}
