package com.chutyrooms.practice.oops

/*
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


    */
/*override fun onTouch() {
        println("Button was Touched")
    }

    override fun onClick() {  //optional to override
        super.onClick()
        println("Button was Clicked")
    }*//*

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
}*/

/*interface MyInterface1
{

    fun doSomething()
    {
        println("MyInterface 1 doing some work")
    }

    fun absMethod()

}
interface MyInterface2 {
    fun doSomthing(){
        println("MyInterface 2 doing some work")
    }
    fun absMethod(name: String)
}

class MyClass : MyInterface1,MyInterface2
{
    override fun doSomthing() {
        super<MyInterface2>.doSomthing()
    }
    override fun absMethod(name: String) {
        TODO("Not yet implemented")
    }

    override fun absMethod() {
        TODO("Not yet implemented")
    }

}*/

/*interface MyInterface{

    val prop: Int
    get()= 23  // property with implementation
   val test:Int
   fun foo(): String
   fun hello()
   {
       println("Hello world")
   }
}

class InterfaceImp: MyInterface{
    override val test: Int=26
    override fun foo(): String="lol"


}*/

/*interface  A {
    fun CallMe() {
        println("From interface A")
    }
}

    interface  B {
        fun CallMe() {
            println("From interface B")
        }
    }

 class  Child : A,B{
     override fun CallMe() {
         super<A>.CallMe()
         super<B>.CallMe()
     }
 }*/

// Interface A with 5 abstract methods
interface A {
    fun method1()
    fun method2()
    fun method3()
    fun method4()
    fun method5()
}

// Abstract class implementing interface A with default implementations
abstract class AbstractA : A {
    override fun method1() {}
    override fun method2() {}
    override fun method3() {}
    override fun method4() {}
    override fun method5() {}
}


    // Class B inheriting from AbstractA and overriding only 3 methods
    class B : AbstractA() {
        override fun method1() {
            // Override method1
        }

        override fun method2() {
            // Override method2
        }


    }



fun main()
{
    //val obj =Child()
    //.CallMe()



}
