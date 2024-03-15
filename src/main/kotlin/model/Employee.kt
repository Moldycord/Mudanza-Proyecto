package org.example.model

class Employee(
    names: String,
    firstLastName: String,
    secondLastName: String,
    phoneNumber: Number,
    val RFC: String,
    val salary: Double,
    val type: String
) : Person(
    names,
    firstLastName,
    secondLastName,
    phoneNumber
) {

    override fun printPersonType() {
        println("Hola soy el empleado ${getFullName()}")
    }
}