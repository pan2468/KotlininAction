package com.kotlin.chapters5

class LambdaExpression ()
{
    data class Person(
        val name: String,
        val age: Int,
    )





//    fun findTheOldest(people: List<Person>){
//        var maxAge = 0
//        var theOldest: Person? = null
//        for (person in people){
//            maxAge = person.age
//            theOldest = person
//        }
//    }
//


}

fun main(){
//    val people = listOf(LambdaExpression.Person("Alice", 29), LambdaExpression.Person("Bob", 31))
//    println(people.maxByOrNull { it.age })
val sum = {x: Int, y:Int -> x + y}
    println(sum(1,2))
}