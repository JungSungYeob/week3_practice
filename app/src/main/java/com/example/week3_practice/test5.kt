package com.example.week3_practice

fun callMyName(msgType: Int): String {
    return if (msgType == 1) "1번" else "2번"
}

fun callMyName2(msgType: Int) = if (msgType == 1) "2번" else "1번"

fun main(args: Array<String>) {
    println(callMyName(1))
    println(callMyName2(1))
}