package com.chutyrooms.kotlinpractice.kotlinpractice

open class Father {
    var car="BMW"
    /*fun carName(){
        println(car)
    }*/
}

open class Child(): Father(){
    //var car1="Audi"
    /*fun carName(){
        println(car)
    }*/
}
class Child1(): Father(){
    //var car1="Audi"
    fun carName(){
        println(car)
    }
}

fun main()
{
    val obj=Child1()
    obj.carName()
}