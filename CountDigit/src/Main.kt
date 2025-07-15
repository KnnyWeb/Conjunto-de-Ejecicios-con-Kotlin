/*
Write a Kotlin program to input a number from user and count number of digits
in the given integer using loop. How to find total digits in a given integer
using loop in Kotlin programming.
 */
fun main() {
    println("Input a number")
    val number = readln().toInt()
    var numberLoop = number
    var countDigit = 0

    do{
        numberLoop /= 10
        countDigit++
    }while (numberLoop != 0)

    println("The number: $number has $countDigit digits")
}
