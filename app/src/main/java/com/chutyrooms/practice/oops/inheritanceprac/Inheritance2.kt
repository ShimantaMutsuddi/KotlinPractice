package com.chutyrooms.practice.oops.inheritanceprac

open class Person(age:Int,name: String) {
    init{
        println("My name is $name")
        println("My age is $age")
    }
}

class MathTeacher(age:Int,name:String):Person(age,name)
{
    fun teachMaths()
    {
        println("I teach math")
    }
}
class Footballer(age: Int, name: String): Person(age, name) {
    fun playFootball() {
        println("I play for LA Galaxy.")
    }
}

fun main()
{
    val t1=MathTeacher(27,"Shimanta")
    t1.teachMaths()
    println()

    val f1 = Footballer(29, "Christiano")
    f1.playFootball()
}

