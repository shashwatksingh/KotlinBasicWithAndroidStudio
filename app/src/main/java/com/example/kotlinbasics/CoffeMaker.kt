package com.example.kotlinbasics

fun main() {
    println("Enter num 1")
    val num1 = readln().toInt()
    println("Enter num 2")
    val num2 = readln().toInt()
//    val myResult = add(num1, num2)
//    println("The sum is $myResult")
    val myResultDivision = divide(num1, num2)
    println("The sum is $myResultDivision")

}

fun divide(num1: Int, num2: Int): Double {
    if(num2 == 0) return 0.0;
    return num1.toDouble()/num2
}

/* Example of adding the return statement*/
fun add(num1: Int, num2: Int): Int {
    return num1 + num2;
}

fun askCustomerDetails() {
    println("Enter customer name")
    val userName = readln()
    println("How many sugar cube will they want to enjoy")
    val sugarCount = readln().toInt()
    makeCoffee(sugarCount, userName)
//    makeCoffee(2, "Alex")
//    makeCoffee(10, "Alex")
//    makeCoffee(1, "Alex")
}

fun makeCoffee(sugarCount: Int, name: String) {
    print("Coffee with ${if(sugarCount == 0 ) "no" else sugarCount} spoon")
    when(sugarCount) {
        1 -> print("")
        else -> print("s")
    }

    print(" of sugar for $name")
    println()
}