package com.chutyrooms.practice.oops





/*
fun main()
{
    val day=Day.SUNDAY
    println(day)
    println(day.number)

    for(i in Day.values())
    {
        println(i)
    }

    day.printFormattedDay()

}

enum class Day(val number: Int)
{
    SATURDAY(1),
    SUNDAY(2),
    MONDAY(3),
    TUESDAY(4),
    WEDNESDAY(5),
    THURSDAY(6),
    FRIDAY(7);

    fun printFormattedDay()
    {
        println("Day id $this")

    }
}*/

fun main()
{
    val tile:Tile=Red("Mushroom",25)
    val tile2:Tile=Red("Mushroom2",25)

    val points=when(tile)
    {
        is Blue -> tile.points*2
        is Red -> tile.points*5
    }
    println(points)
    /*val tile2=Red("fire",35)

    println("${tile.points} - ${tile.type}")*/

}

sealed class Tile

class Red(val type: String,val points: Int) : Tile()
class Blue(val points: Int):Tile()
