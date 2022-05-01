package com.kt.action.chapter4

class CUser private constructor(val nickname: String) {
    companion object InnerUser : User {

        fun newSubUser(email: String) = CUser(email)

        fun newFaceBookUser(account: Int) = CUser(account.toString())

        override val nickName: String
            get() = ""
    }
}

fun main(args: Array<String>) {
    load(CUser)
}

fun load(user: User) {
    println(user.toString())
}
