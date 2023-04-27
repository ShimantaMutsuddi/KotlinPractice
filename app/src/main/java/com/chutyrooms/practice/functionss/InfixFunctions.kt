package com.chutyrooms.practice.functionss

fun main()
{
    /*** All Infix functions are extension Function but
     *  all extension function are not infix function
     *  Infix functions only contain one parameter **/



    val x:Int=6
    val y:Int=10

    println("Greater number is ${y.greterValue(x)}")
    /*** The benefit of using "infix" keyword is we can call is by "y greterValue x" */



}

infix fun Int.greterValue(other: Int) =if (other>this) other else this