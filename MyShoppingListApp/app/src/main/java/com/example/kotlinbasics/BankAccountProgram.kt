package com.example.kotlinbasics

fun main() {
    val bankAccount = BankAccount("Shashwat", 1338.28)
    println("Holder - ${bankAccount.accountHolder}")
    bankAccount.deposit(500.00);
    println(bankAccount.displayTransactionHistory())
    bankAccount.withdraw(100.00);
    println(bankAccount.displayTransactionHistory())

    println("balance is : ${bankAccount.balance}")
}