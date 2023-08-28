package com.chutyrooms.kotlinpractice.bsstaff

fun main()
{
    val log = AuthLog("Shimo")



}

/*open class Persoon()
{
   open fun  displayAge(age:Int)
    {

        println("My age is $age")
    }
}

class Boy:Persoon()
{
    override fun displayAge(age: Int) {
        super.displayAge(age)
        println("My fake age is ${age - 5}.")
    }
 */
open class Log{
    var data: String=""
    var numberOfData=0
    constructor(_data:String)
    {
        data=_data


        println("$data: $numberOfData times")
    }
    constructor(_data:String,_numberOfData:Int)
    {
        data=_data
        numberOfData=_numberOfData
        println("$data: $numberOfData times")
    }

}

class AuthLog:Log{
    constructor(_data: String):this("From AuthLog -> $_data",10)
    constructor(_data: String, _numberOfData: Int): super(_data) {
    }
}

/*
open class Employee(name: String , jobId:String)
{
    init{
        println("$name's id is $jobId")
    }
}
class Teacher(name: String , jobId:String):Employee(name,jobId)
{
    fun teachStudent()
    {
        println("I am a teacher")
    }
}
class Cleaner(name: String , jobId:String):Employee(name,jobId)
{
    fun cleanRoom()
    {
        println("I am a cleaner")
    }
}*/
