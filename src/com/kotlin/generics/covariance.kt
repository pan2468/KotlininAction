package com.kotlin.generics

interface Producer<out T>{ // 클래스가 T에 공변이라고 선언
    fun produce() : T
}
