package com.kotlin.generics


fun printSum(c: Collection<*>){
    val intList = c as? List<Int>
        ?:throw IllegalArgumentException("List is expected")
    println(intList.sum())
}


fun main() {
    println(setOf(1,2,3))
}