package com.example.kotlinbasics

fun main() {
    val shoppingList = mutableListOf("Processor", "RAM", "Graphic Card RTX 3060", "SSD")

    // add items to list
    shoppingList.add("Cooling Systems")
    shoppingList.remove("Graphic Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")

    println(shoppingList)

    // adding/removing an item
    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(2, "RAM")
    println(shoppingList)

    //indexing and setting the items in the lists
    shoppingList[3] = "Graphic Card RX 7800XT"
    println(shoppingList)

    shoppingList.set(1, "Water Cooling")
    println(shoppingList)

    // check if contains
    println(shoppingList.contains("RAM"))

    //looping over a lists
    for (item in shoppingList)
        println(item)

    // for loop with until operator
    for (i in 0 until shoppingList.size){
        println("item ${shoppingList[i]} is at index $i")
    }

    // for loop with .. operator
    for (i in 0..shoppingList.size-1) {
        println("item ${shoppingList[i]} is at index $i")
    }
}