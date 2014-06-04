package v_collections

fun example8() {
    val numbers = listOf(1, 3, -4, 2, -11)

    //the details (how multi-assignment works) you'll found in 'Conventions' task later
    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    // Return customers who have more undelivered orders than delivered
    todoCollectionTask()
}