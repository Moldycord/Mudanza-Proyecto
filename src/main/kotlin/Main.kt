package org.example

import org.example.controllers.CustomersControllers
import org.example.controllers.EmployeesController
import org.example.controllers.IController
import org.example.model.Customer
import org.example.model.Employee
import org.example.model.Person

fun main() {

    val customer = Customer(
        "Miriam",
        "Cupul",
        "Dzul",
        8888888888,
        "Cancun Crucero"
    )
    printPerson(customer)

    val employee = Employee(
        "Ignacio",
        "Hernandez",
        "Perez",
        9999999999,
        "FDSGHDFESR",
        1000.00,
        "Repartidor"
    )

    printPerson(employee)

}

fun printPerson(person: Person) {
    println(person.printPersonType())
}