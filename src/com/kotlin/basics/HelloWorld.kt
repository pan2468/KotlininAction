package com.kotlin.basics

fun main(args: Array<String>){
//    println("Hello,world")
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello,$name!")
}