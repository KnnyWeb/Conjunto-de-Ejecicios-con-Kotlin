//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("How many Fibonacci numbers would you like to print? ")
    val n = readln().toInt()
    var firstFibonacciNumber = 0
    var secondFibonacciNumber = 1
    var thirdFibonacciNumber: Int
    println(firstFibonacciNumber)
    println(secondFibonacciNumber)
    var i = 1
    while(i <= n - 2){
        thirdFibonacciNumber = secondFibonacciNumber + firstFibonacciNumber
        println(thirdFibonacciNumber)
        firstFibonacciNumber = secondFibonacciNumber
        secondFibonacciNumber = thirdFibonacciNumber
        i++
    }
}