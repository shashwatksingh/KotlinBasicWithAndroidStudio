package com.example.kotlinbasics

fun helloWorld () {
    println("Hello World!")
    val number1=1
    var myAge: Byte = 36
    var pi = Math.PI;
}

fun main() {
    helloWorld()
    var winner = ""
    var userChoice: String = ""
    var count = 0

    // Commenting to test - 1
    while (count<3) {
        println("Rock -> 1, paper -> 2, scissors -> 3? Enter your choice!")
        userChoice = readln()
        if(userChoice.equals("1") || userChoice.equals("2") || userChoice.equals("3")) break
        count++

        if(count == 3) {
            println("Wrong input entered 3 times")
            return
        }
    }

    var userOption = userChoice.toInt()

    val randomNumber = (1..3).random()
    println("Computer choice: ${randomNumber}")

    winner = when {
        userOption == randomNumber -> "Tie"
        userOption == 1 && randomNumber == 2  || userOption == 2 && randomNumber == 3 || userOption == 3 && randomNumber == 1 -> "Computer"
        else -> "User"
    }

    println(winner)
}

enum class Options(val option: Int) {
    Rock(1),
    Paper(2),
    Scissor(3)
}


