package com.kt.action.chapter6

import java.lang.IllegalArgumentException

class Address(val country: String)
class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun printShippingLabel(person: Person){
    val address = person.company?.address
        ?: throw IllegalArgumentException("삐")

    with(address){
        println(country)
    }
}
