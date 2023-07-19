fun main() {
    print("Enter any number: ")
    val num = readLine()?.toInt()
    if (num != null)
        println(if (num % 2 == 0) "$num is even number." else "$num is odd number.")
    else
        println("Invalid Input!!")
}

