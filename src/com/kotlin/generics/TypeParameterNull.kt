package com.kotlin.generics

class Processor<T>{
    fun process(value: T){
        value?.hashCode()
    }
}

fun main() {
    val nullableStringProcessor = Processor<String?>()
    nullableStringProcessor.process(null)
    println(nullableStringProcessor)
}