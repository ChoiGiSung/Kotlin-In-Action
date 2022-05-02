package com.kt.action.chapter5

fun alphabetWith() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append(" ha ha ")
    toString()
}

fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append(" ha ha ")
}.toString()

fun alphabetBuildString() = buildString {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append(" ha ha ")
}.toString()
