package com.chutyrooms.practice.oops

 abstract class Perrson(name: String ) {

    init {
        println("My name is $name.")
    }
    fun display(ssn:Int)
    {
        println("My SSN is $ssn")
    }

    abstract fun displayJob(dercription: String)
}

class Teacher(name:String):Perrson(name)
{
    override fun displayJob(dercription: String) {
        println(dercription)
    }

}

fun main()
{
    val shimanta=Teacher("Shimanta")
    shimanta.displayJob("I'm a developer")
    shimanta.display(23123)

}
