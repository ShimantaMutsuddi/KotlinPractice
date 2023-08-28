package com.chutyrooms.kotlinpractice.bsstaff

fun main()
{
    val person1 = Person( _age = 25)
    val person2 = Person( "Shimanta")
    val person3 = Person( "Shimanta",27)
    val person4 = Person( )





}

class Person( _firstName: String="UNKNOWN",  _age: Int=0)
{
    val firstName=_firstName.uppercase()
    var age=_age
    init{
        println("First Name = ${firstName.uppercase()}")
        println("Age = $age")
    }
}


