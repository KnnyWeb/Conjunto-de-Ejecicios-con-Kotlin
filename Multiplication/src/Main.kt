//Write a program to input a number from user and print multiplication table of the given number
//Write a number to set the limit for the multiplication table.
fun main() {
    print("Enter the number for the multiplication table you want to see: ")
    val tableNumberMultiplicationNumber = readln().toInt()
    print("Enter the limit for the multiplication table: ")
    val limitNumberMultiplication = readln().toInt()
    var i = 1
    while(i <= limitNumberMultiplication){
        println("$tableNumberMultiplicationNumber * $i = ${ tableNumberMultiplicationNumber * i}")
        i++
    }
}