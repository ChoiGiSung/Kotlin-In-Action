package com.kt.action.chapter1

import java.util.*

class Eter {

    val oneToTen = 1..10

    fun eter(){
        for(i in oneToTen){
            // 1 부터 10 까지
            println(i)
        }

        for (i in 100 downTo 1 step 2){
            //100 부터 1까지 2씩 감소
            println(i)
        }

        for( i in 0 until 100){
            // 0 부터 99까지
            println(i)
        }
    }

    fun map(){
        val binaryReps = TreeMap<Char,String>()

        for( c in 'A'..'F'){
            val binary = Integer.toBinaryString(c.toInt())
            binaryReps[c] = binary
        }

        for ((letter,binary) in binaryReps){
            println("$letter = $binary")
        }
    }
}
