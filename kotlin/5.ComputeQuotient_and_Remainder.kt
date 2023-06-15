//Kotlin Program to Compute Quotient and Remainder

fun main() {

    println("Enter the value of dividend :-  ")
    val dividend = readLine()!!.toInt()

    println("Enter the value of divisor :- ")
    val divisor = readLine()!!.toInt()

    val quotient = dividend / divisor
    val remainder = dividend % divisor

    println("Quotient = $quotient")
    println("Remainder = $remainder")


}