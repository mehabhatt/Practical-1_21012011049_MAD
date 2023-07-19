fun main() {
    println("21012011049_Meha Bhatt")
    print("Enter number:")
    var num = readLine()?.trim()!!.toInt()
    val fact = factorial(num)
    val fact2=factorialTailRec(num)
    println("Factorial of $num is $fact")
    println("Factorial of $num using tailrec keyword is $fact2")

}
fun factorial(n: Int): Long {
    return if (n == 0) {
        1
    }
    else {
        n * factorial(n - 1)
    }
}
tailrec fun factorialTailRec(n: Int, accumulator: Long = 1): Long
{
    return if (n == 0) {
        accumulator
    }
    else {
        factorialTailRec(n - 1, accumulator * n)
    }
}