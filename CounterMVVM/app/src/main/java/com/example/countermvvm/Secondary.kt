package com.example.countermvvm

// Inherits from BaseClass
class Secondary: BaseClass() {
    override fun role() {
        super.role()

        println("Knight of the House of BaseClass")
    }
}