package com.kotlin.chapters2


fun main(args: Array<String>){

    fun getMnemonic(color:Color) =
        when (color){
            Color.RED -> "Richard"
            Color.ORANGE -> "of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }

        println(getMnemonic(Color.BLUE))
}