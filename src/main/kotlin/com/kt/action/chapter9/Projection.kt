package com.kt.action.chapter9

import kotlin.reflect.KClass

interface FieldValidator<in T> {
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String): Boolean {
        return input.isNotEmpty()
    }

}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int): Boolean {
        return input > 0
    }

}

fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

    val fieldValidator = validators[String::class] as FieldValidator<String>
    println(fieldValidator.validate(""))


    //오류 발생
    val intValidator = validators[Int::class] as FieldValidator<String>
    println(intValidator.validate(""))
}
