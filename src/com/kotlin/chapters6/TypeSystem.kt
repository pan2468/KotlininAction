package com.kotlin.chapters6

class TypeSystem (){
    
}

fun main(){
    fun printAllCaps(s: String?) {
        val allCap: String? = s?.toUpperCase()
        println(allCap)
    }
    // TODO: 2023-01-06  널 아닌 값 넣기 
    printAllCaps("abc")
    
    // TODO: 2023-01-06 널 허용 값 넣기 
    //printAllCaps(null)
}