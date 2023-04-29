package com.chutyrooms.practice.functionss


fun main()
{

    /*** default argument**/
    println("Output when no argument is passed:")
    displayBorder()
    println("\n\n'*' is used as a first argument.")
    println("Output when first argument is passed:")
    displayBorder('*')
    println("\n\n'^' is used as a first argument.")
    println("Output when first argument is passed:")
    displayBorder('^',9)

    /*** named argument**/
    println("\n\nOutput when named argument is passed:")
    displayBorder(length = 4, character = '$')



}



fun displayBorder(character: Char= '#',length: Int=15)
{
    for(i in 1..length)
    {
        print(character)
    }
}