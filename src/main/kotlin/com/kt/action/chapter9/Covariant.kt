package com.kt.action.chapter9

interface Producer<out T> {
    fun produce(): T
}
