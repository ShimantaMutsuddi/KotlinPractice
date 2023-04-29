package com.chutyrooms.practice.oops


 /*** The class has one property isOn (defined in same way as variable),
  *  and two member functions turnOn() and turnOff().**/
class Lamp{

    private var isOn:Boolean=false


    // property (data member)
    // member function
    fun turnOn()
    {
        isOn=true

    }
    fun turnOff()
    {
        isOn=false

    }

     fun displayLightStatus(lamp:String)
     {
         if(isOn == true)
             println("$lamp lamp is on.")
         else
             println("$lamp lamp is off.")
     }
}

fun main()
{
    var l1=Lamp() // create l1 object of Lamp class
    val l2 = Lamp() // create l2 object of Lamp class

    // access properties and member function of class by using '.' notation .

    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")



    // if isOn property is private and we try to access it from outside an exception will be thrown
    //l2.isOn= false -> throw an exception
}

/***  private - visible (can be accessed) from inside the class only.
      public - visible everywhere.
      protected - visible to the class and its subclass.
      internal - any client inside the module can access them. */