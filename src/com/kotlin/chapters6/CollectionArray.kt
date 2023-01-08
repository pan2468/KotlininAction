package com.kotlin.chapters6

class CollectionArray (){

}

fun main(){

    fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>){

        for(item in source){
            target.add(item)
        }
    }

    val source: Collection<Int> = arrayListOf(3,5,7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source,target)
    println(target)
}
