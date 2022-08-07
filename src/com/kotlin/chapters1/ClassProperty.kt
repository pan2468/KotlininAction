package com.kotlin.chapters1

class Persons(
    val name: String,
    var isMarried: Boolean
)

fun main(args: Array<String>) {
    val person = Persons("Bob",true)
    println(person.name)
    println(person.isMarried)
}