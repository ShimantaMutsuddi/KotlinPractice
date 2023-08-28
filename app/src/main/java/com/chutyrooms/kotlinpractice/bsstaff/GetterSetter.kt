package com.chutyrooms.kotlinpractice.bsstaff

class Girl {

    var age: Int=0
    get() = field

    set(value) {
        field= if(value<18)
            18
        else if (value>= 18 && value <=30)
            value
        else
            value-3
    }
    var actualAge: Int = 0

}

fun main()
{
    val puja= Girl()

    puja.actualAge=15
    puja.age=15

    println("Maria: actual age = ${puja.actualAge}")
    println("Maria: pretended age = ${puja.age}")
}