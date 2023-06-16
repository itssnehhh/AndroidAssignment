//WAP to find max value using function as express.
fun Max(num1 : Int , num2 :Int):Int
{
    return if(num1>num2)num1
    else num2
}

fun main(){
    println("Enter the number 1 :-")
    var num1 = readLine()!!.toInt()

    println("Enter the number 2 :-")
    var num2 = readLine()!!.toInt()

 
    println("Maximum number from given number is = ${Max(num1,num2)}")
}
