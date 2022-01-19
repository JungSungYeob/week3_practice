package com.example.week3_practice

fun main() {
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null //?는 true false 외에도 null값 가능하게 함

    println(myTrue || myFalse) //or
    println(myTrue && myFalse) //and
    println(!myTrue) //not
}