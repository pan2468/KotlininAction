package com.kotlin.chapters5

class CollectionFunction (){

    data class Person(
        val name:String,
        val age: Int
    )
}

fun main(){
//    val people = listOf(CollectionFunction.Person("Alice",29), CollectionFunction.Person("Bob",31))
//    println(people.filter { it.age > 30 })
// TODO: 2023-01-04 map 컬렉션 함수 사용
//    val list = listOf(1,2,3,4)
//    println(list.map { it * it })

    val people = listOf(CollectionFunction.Person("Alice",29), CollectionFunction.Person("Bob",31))
    //println(people.map { it.name })
    println(people.filter { it.age > 30 }.map (CollectionFunction.Person :: name))
}


