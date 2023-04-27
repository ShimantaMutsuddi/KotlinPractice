package com.chutyrooms.practice.functionss

/***We can add functions to the classes without declaring it*/

fun main()
{
    val str1: String="Hello "
    val str2: String="World "

    var str3:String="Hey "

    println(str3.add(str1,str2))

    val x:Int=6
    val y:Int=10

    println("Greater number is ${y.greaterValue(x)}")



}

infix fun Int.greaterValue(other: Int) =if (other>this) other else this //infix and extension function

fun String.add(s1:String,s2:String)= this+s1+s2 // extension function

/*
fun Student.isScholar(marks: Int): Boolean
{
    return marks>95
}

class Student{
    fun hasPassed(marks:Int):Boolean{
        return marks>40
    }
}
*/

/*
class Structure()
{
    infix fun createPyramid(rows: Int)
    {
        var k=0
        for(i in 1..rows){
            k=0
            for(space in 1..rows-i)
            {
                print(" ")
            }
            while(k!=2*i-1)
            {
                print("* ")
                ++k
            }
            println()

        }
    }
}*/
