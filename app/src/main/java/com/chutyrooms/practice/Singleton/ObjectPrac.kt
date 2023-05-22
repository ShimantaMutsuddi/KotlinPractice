package com.chutyrooms.practice.Singleton


/*** If we want to make a class singleton then we just mark a class as object*/
object CustomerData{
    var count:Int=-1 //behaves like Static variable

    fun typeOfCustomers(): String{  // behaves like static method
        return "Indian"
    }
}

fun main()
{

    println("${CustomerData.count}  , ${CustomerData.typeOfCustomers()}")

}