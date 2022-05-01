package com.kt.action.chapter4

class CUser private constructor(val nickname: String) {
    companion object {
        fun newSubUser(email: String) {

        }

        fun newFaceBookUser(account: Int) = CUser(account.toString())
    }
}
