package com.chutyrooms.kotlinpractice.random



fun main()
{
    val myCar= Car()
    myCar.make="Toyota"
    myCar.model="Camry"
    myCar.year=2023

    println(myCar.getInfo())
}


class Car
{
    lateinit var make: String
    lateinit var model: String
     var year: Int = 0

    fun getInfo(): String{

        return "$make $model , year $year"
    }

}