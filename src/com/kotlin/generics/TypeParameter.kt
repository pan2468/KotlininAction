package com.kotlin.generics

//fun<T: Number> oneHalf(value: T): Double{
//    return value.toDouble() / 2.0
//}
//
//fun main() {
//
// println(oneHalf(3))
//
//}

fun <T: Comparable<T>> max(first:T, second: T):T{
    return if (first > second) first else second
}

fun main() {
    println(max("kotlin","java"))
}

