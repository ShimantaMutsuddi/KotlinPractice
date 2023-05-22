package com.chutyrooms.practice.Singleton

class CustomersData {

    companion object {
        var count:Int=-1 //behaves like Static variable

        fun typeOfCustomers(): String{  // behaves like static method
            return "Indian"
        }
    }
}

fun main()
{
    println("${CustomersData.count} and ${CustomersData.typeOfCustomers()}")
}