package org.example.model

class Customer(
    names: String,
    firstLastName: String,
    secondLastName: String,
    phoneNumber: Number,
    val address: String
) : Person(
    names,
    firstLastName,
    secondLastName,
    phoneNumber
) {

    override fun printPersonType() {
        println("Hola soy el cliente ${getFullName()}")
    }
}