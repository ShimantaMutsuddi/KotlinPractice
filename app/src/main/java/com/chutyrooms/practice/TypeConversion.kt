package com.chutyrooms.practice

fun main(args:Array<String>)
{
    /*** In kotlin a numeric valoe of one type is not automatically converted
     * to another type . even when the other type is larger*/

    val number1: Int =55
    val number2:Long=number1.toLong()
}