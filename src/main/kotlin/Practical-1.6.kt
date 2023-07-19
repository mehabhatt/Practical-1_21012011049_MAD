fun main() {
    println("21012011049_Meha Bhatt")
    print("Enter first number:")
    var num1 = readLine()?.trim()!!.toDouble()
    print("Enter second number:")
    var num2 = readLine()?.trim()!!.toDouble()
    println("First number: $num1")
    println("Second number: $num2")
    println("Addition of $num1 and $num2 = ${add(num1, num2)}")
    println("Subtraction of $num1 and $num2 = ${subtract(num1, num2)}")
    println("Multiplication of $num1 and $num2 = ${multiply(num1, num2)}")
    println("Division of $num1 and $num2 = ${divide(num1, num2)}")
}

fun add(a: Double, b: Double): Double {
    return a + b
}

fun subtract(a: Double, b: Double): Double {
    return a - b
}

fun multiply(a: Double, b: Double): Double {
    return a * b
}

fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Division by zero is not allowed.")
    }
    return a / b
}
