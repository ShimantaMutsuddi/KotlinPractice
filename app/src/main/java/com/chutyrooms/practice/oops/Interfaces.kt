package com.chutyrooms.practice.oops

interface myInterfaceListener { // we cannot create instance of abstract class and interface

   // var name: String  //Properties in interface are abstract by default

      fun onTouch()    //Methods in interface are abstract by default


    //this onclick method is open and public by default not final
    fun onClick()
    {
        println("interface -> Button was clicked")

    }

}
interface mySecondInterface { // we cannot create instance of abstract class and interface

   // var name: String  //Properties in interface are abstract by default

    fun onTouch()
    {
        println("Second interface -> Button was Touched")
    }


    //this onclick method is open and public by default not final
    fun onClick()
    {
        println("interface -> Button was clicked")

    }

}

class Button:myInterfaceListener,mySecondInterface
{
   // override var name: String="Shimanta"


    /*override fun onTouch() {
        println("Button was Touched")
    }

    override fun onClick() {  //optional to override
        super.onClick()
        println("Button was Clicked")
    }*/
    override fun onTouch() {
        TODO("Not yet implemented")
    }

    override fun onClick() {
        super<myInterfaceListener>.onClick()
        super<mySecondInterface>.onClick()
    }




}

fun main()
{
    var myButton=Button()
    myButton.onTouch()
    myButton.onClick()
}