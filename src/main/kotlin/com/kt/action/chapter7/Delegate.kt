package com.kt.action.chapter7

import java.lang.reflect.Type
import kotlin.reflect.KProperty

class Delegate<T> {
    operator fun getValue(param1: T, param2: KProperty<*>): Type {
        TODO("Not yet implemented")
    }


    operator fun setValue(param1: T, param2: KProperty<*>, type: Type) {
        TODO("Not yet implemented")
    }
}
