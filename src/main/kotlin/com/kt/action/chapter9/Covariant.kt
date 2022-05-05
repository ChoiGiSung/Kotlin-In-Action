package com.kt.action.chapter9

open class Animal {
    fun feed() {

    }
}

class Herd<out T : Animal> {
    val size: Int get() = 2

    fun feedAll(animals: Herd<Animal>){
        for ( i in 0 until animals.size){

        }
    }


    fun takeCareOfCats(cats: Herd<Cat>){
        for ( i in 0 until cats.size ){
            feedAll(cats)
        }
    }
//
//    fun inOut(s:T){
//        컴파일 에러
//    }


}

class Cat : Animal(){

}
