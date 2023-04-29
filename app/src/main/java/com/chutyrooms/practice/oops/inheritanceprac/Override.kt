package com.chutyrooms.practice.oops.inheritanceprac

/****If the base class and the derived class contains a member function (or property) with the same name,
 *  you can need to override the member function
 * of the derived class using override keyword,
 * and use open keyword for the member function of the base class.*/

open class Perrson()
{
    open var age: Int = 0

    get()=field
    set(value)
    {
        field=value
    }
    open fun displayAge(age:Int)
    {
        println("My age is $age")
    }

}
class Girl: Perrson()
{
    override fun displayAge(age: Int) {
        println("My fake is ${age-1}")
    }
}

fun main()
{
    val girl=Girl()
    girl.displayAge(31)
}