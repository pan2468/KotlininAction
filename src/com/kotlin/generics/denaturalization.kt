package com.kotlin.generics

fun printContents(list: List<Any>){
    println(list.joinToString())
}

fun main() {
    printContents(listOf("abc","bac"))
}