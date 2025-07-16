fun main(args: Array<String>) {
    var array = arrayOf(1, 2, 3, 4, 5)
    println("Original array: ${array.joinToString(", ")}")

    var squaredArray = array.map { it * it }
    println("Squared array: ${squaredArray.joinToString(", ")}")

    var evenArray = array.filter { it % 2 == 0 }
    println("Even numbers: ${evenArray.joinToString(", ")}")
}