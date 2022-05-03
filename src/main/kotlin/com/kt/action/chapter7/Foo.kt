package com.kt.action.chapter7

import java.lang.reflect.Type

class Foo {

    var p: Type by Delegate()
}

class Person {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String by _attributes
}

fun main(){
    val person = Person()

    person.setAttribute("name","영희")
    println(person.name)
}
