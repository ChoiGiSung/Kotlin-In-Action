package com.kt.action.chapter8

fun nonLocalReturn() {
    val list = listOf(1, 2, 3)

    list.forEach() {
        if (it == 1) {
            //non 로컬 함수 자체를 끝냄
            return
        }
    }
}

fun localReturn() {
    val list = listOf(1, 2, 3)

    list.forEach label@{
        if (it == 1) {
            //non 로컬 함수 자체를 끝냄
            return@label
        }
    }
}
