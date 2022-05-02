package com.kt.action.chapter5

fun alphabet() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append(" ha ha ")
    toString()
}
