package com.chutyrooms.practice.oops


/****
   * A constructor is a concise way to initialize class properties.
   * It is a special member function that is called when an object is instantiated (created).
   * In Kotlin, there are two constructors:
        > Primary constructor - concise way to initialize a class
        > Secondary constructor - allows you to put additional initialization logic*/

 /***Primary Constructor- is part of the class header. Here's an example:
*/
   /* class Person(val firstName: String, var age: Int) {
    // class body
    }*/

/***Primary constructor with initializer block*/

/*class Person(fName:String,age:Int)
{
    val firstName:String
    val personAge:Int
    //initializer block
    init {
        firstName=fName
        personAge=age
    }
}*/

/***Default Value in Primary Constructor*/
/*class Person(_firstName:String="Unknown",_age:Int=0)
{
    val firstName=_firstName.uppercase()
    var age=_age

    init {
        println("First Name = $firstName")
        println("Age = $age\n")
    }
}*/

/***kotlin secondary constructor**/

open class Log
{
    var data: String=""
    var numberOfData=0
    constructor(_data:String)
    {

    }
    constructor(_data:String,_numberOfData:Int)
    {
        data=_data
        numberOfData=_numberOfData
        println("$data : $numberOfData times")

    }
}

class AuthLog:Log{
    constructor(_data: String):this("From AuthLog -> "+_data,10)
    constructor(_data: String,_numberOfData: Int):super(_data,_numberOfData)
}

 fun main()
 {
     /*val person1= Person("Shimanta",27)
     val person2=Person()*/

     val log=AuthLog("Bad Password")
 }


