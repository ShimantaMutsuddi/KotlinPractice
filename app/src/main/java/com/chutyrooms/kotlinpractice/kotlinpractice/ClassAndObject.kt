package com.chutyrooms.kotlinpractice.kotlinpractice

fun main()
{
    val name: String?=null

   // println(if(name==null) -1 else name)
    var lambda={a:Int,b:Int->a+b}
    println(lambda(2,3)  )
}