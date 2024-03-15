package org.example.controllers

import org.example.model.Employee

class EmployeesController : IController {

    override fun registerModel() {


        val addedEmployee = Employee(
            "Ramon",
            "Avila",
            "Mayo",
            9821382921,
            "HJSHDJHFJS78989",
            1000.00,
            "VENDEDOR"
        )
    }

    override fun showAllModels() {
        TODO("Not yet implemented")
    }

}