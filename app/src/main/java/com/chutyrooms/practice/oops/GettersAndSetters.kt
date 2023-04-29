package com.chutyrooms.practice.oops

/***In programming, getters are used for getting value of the property.
 *  Similarly, setters are used for setting value of the property.
    In Kotlin, getters and setters are optional and are auto-generated
     if we do not create them in your program.*/

/*
//The following code in Kotlin

class Person {
    var name: String = "defaultValue"
}
//is equivalent to

class Person {
    var name: String = "defaultValue"

        // getter
        get() = field

        // setter
        set(value) {
            field = value
        }
}*/

class Girl
{
    var age: Int=0

    get()=field
    set(value)
    {
        field=if(value<18) 18
        else if (value>=19 && value<=30)
            value
        else value-3
    }
    var actualAge: Int = 0
}

fun main()
{
    val shimo=Girl()
    shimo.age=15
    shimo.actualAge=15

    println("Shimo : actual age = ${shimo.actualAge}")
    println("Shimo :  age = ${shimo.age}")

    val angela = Girl()
    angela.actualAge = 35
    angela.age = 35
    println("Angela: actual age = ${angela.actualAge}")
    println("Angela: pretended age = ${angela.age}")
}
