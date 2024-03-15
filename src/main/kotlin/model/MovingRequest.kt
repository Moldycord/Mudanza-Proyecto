package org.example.model

class MovingRequest(
    val client: Customer,
    val employee: Employee,
    val totalPrice: Double,
    var isCancelled: Boolean = false,
    val dueDate: String
)