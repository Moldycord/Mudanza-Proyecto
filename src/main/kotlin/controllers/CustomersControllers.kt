package org.example.controllers

import org.example.model.Customer
import org.example.utils.Printer

class CustomersControllers(val printer: Printer) : IController {

    private val customerList = mutableListOf<Customer>()

    /**Función para registrar un nuevo customer **/
    override fun registerModel() {

        /**Empezamos a solicitar los datos al usuario **/
        printer.apply {
            printMsg("Ingrese el nombre/nombres")
            /**Guardamos los inputs del usuario en una variable **/
            val customerNames = readln()
            printMsg("Ingrese el primer apellido")
            val customerFirstLastName = readln()
            printMsg("Ingrese el segundo apellido")
            val secondLastName = readln()
            printMsg("Ingrese el número celular")
            //en este caso hay que convertir el string a long
            val phoneNumber = readln().toLong()
            printMsg("Ingrese la dirección")
            val address = readln()

            /**Creamos una instancia de Customer pasandole
             *  como parametros las variables donde guardamos los inputs del usuario
             *  y la añadimos a la lista **/
            val customer = Customer(
                customerNames,
                customerFirstLastName,
                secondLastName,
                phoneNumber, address
            )

            customerList.add(customer)
        }
    }

    override fun showAllModels() {
    }
}