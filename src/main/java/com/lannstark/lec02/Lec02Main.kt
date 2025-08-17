package com.lannstark.lec02

fun main(){
    val str: String? = null
    println(str?.length?:0)
}

fun startsWithA1(str: String?): Boolean{
    // requireNotNull을 사용하여 null이 아님을 단언하고, 아닐 경우 예외를 던집니다.
    requireNotNull(str) { "null이 들어왔습니다" }
    return str.startsWith("A")

}

fun startsWithA2(str: String?): Boolean?{
    // 세이프 콜(?.)을 사용합니다. str이 null이면 전체 결과가 null이 됩니다.
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean{
    // 세이프 콜(?.)과 엘비스 연산자(?:)를 함께 사용합니다.
    // str?.startsWith("A")가 null이면 (즉, str이 null이면) false를 반환합니다.
    return str?.startsWith("A")
        ?: false
}