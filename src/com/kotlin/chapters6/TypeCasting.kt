package com.kotlin.chapters6

class TypeCasting (){

}

fun main()
{

    // TODO: 2023-01-07 is 타입 체크 확인하기
    val animal: String = "호랑이"
    if(animal is String) {
        val value: Int = animal as? Int ?: 0
        println(value)
    }

    val string = "1234"
    val intCasting: Int = string.toInt()
    println(intCasting)

    val int = 1
    val strCasting: String = int.toString()
    println(strCasting)

    val doubleConversion = 10
    val integerCasting: Double = doubleConversion.toDouble()
    println(integerCasting)



}