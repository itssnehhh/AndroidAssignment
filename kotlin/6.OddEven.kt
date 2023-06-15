//Kotlin Program to Check Whether a Number is Even or Odd

fun main() {

    println("Enter a number :- ")
    val num = readLine()!!.toInt()

    if(num %2 ==0)
        println("Given number $num is Even.")
    else
        println("Given number $num is Odd.")

}