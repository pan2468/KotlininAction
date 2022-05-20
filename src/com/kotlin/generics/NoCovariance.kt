package com.kotlin.generics

//open class Animal {
//    fun feed() { ... }
//}
//class Herd<T : Animal> {  // 이 타입 파라미터를 무공변성으로 지정한다.
//    val size: Int get() = ...
//    operator fun get(i: Int): T { ... }
//}
//fun feedAll(animals: Herd<Animal>) {
//    for (i in 0 until animals.size) {
//        animals[i].feed()
//    }
//}
//
//// 사용자 코드가 고양이 무리를 만들어서 관리한다.
//class Cat : Animal() {
//    fun cleanLitter() { ... }
//}
//fun takeCareOfCats(cats: Herd<Cat>) {
//    for (i in 0 until cats.size) {
//        cats[i].cleanLitter()
//        // feedAll(cats)
//    }
//}
