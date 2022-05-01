package com.kt.action.chapter4

class PrivateUser(override val nickName: String) : User

class SubscribingUser(val email: String) : User {

    //매번 계산
    override val nickName: String
        get() = email.substringBeforeLast("@")
}

class FaceBookUser(val acoount: String) : User {
    //선언시 한번만
    override val nickName: String = getNickName(acoount)
}

fun FaceBookUser.getNickName(account: String) = account.substringBeforeLast("@")
