package com.example.kotlinbasics

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance+=amount;
        transactionHistory.add("$accountHolder deposited amount : $amount")
    }

    fun withdraw(amount: Double){
        if(balance-amount < 0) {
            println("You cannot withdraw money")
            return;
        }
        balance-=amount;
        transactionHistory.add("$accountHolder withdrawn amount : $amount")
    }

    fun displayTransactionHistory(): String {
        return transactionHistory.toString()
    }
}