//Kotlin Program to Add to Two Integers

fun main() {
    println("Enter the value 1 :-  ")
    var num1 = readLine()!!.toInt()

    println("Enter the value 2 :- ")
    var num2 = readLine()!!.toInt()

    println("Value of num1 : $num1")
    println("Value of num2 : $num2")

    println("Addition od $num1 and $num2 is = ${num1+num2}")
}