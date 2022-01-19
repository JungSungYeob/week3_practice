package com.example.week3_practice
/*

safe call unsafe call

fun main(){
    val a = "Kotlin"
    val b: String? = null //?는 null 들어가도 상관없음
    println(b?.length) //b가 널이면 널로 출력 아니면 제대로 출력
    println(a?.length) //unnecessary safe call
}
 */

fun main() {
    val listWithNulls: List<String?> = listOf("Kotlin", null, "hi")
    for (item in listWithNulls) {
        item?.let { println(it) } //prints kotlin and ignores null
    }
}