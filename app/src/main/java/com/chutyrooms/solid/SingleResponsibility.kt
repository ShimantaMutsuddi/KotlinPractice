package com.chutyrooms.solid

class Square {

    fun calculateArea(side: Int):Int
    {
        return  side*side
    }
    fun calculatePerimeter(side: Int):Int
    {
        return  4*side
    }

  /*  fun renderSquare(){
        println("Render square")
    }

    fun renderLargeSquare(){
        println("Render large  square")
    }*/



}

class SquareUi{
    fun renderSquare(){
        println("Render square")
    }

    fun renderLargeSquare(){
        println("Render large  square")
    }

}