package com.kotlin.chapters6

class NullProperty ()

class Employee(val name: String, val manager: Employee?)


fun main(){

    fun managerName(employee: Employee): String? = employee.manager?.name
    val ceo = Employee("Da Boss", null)
    println(managerName(ceo))


}