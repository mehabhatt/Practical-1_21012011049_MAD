fun main(){
    print("Enter the month number:")
    val MonthNumber= readLine()?.trim()!!.toInt()
    val monthName= when (MonthNumber) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Please enter proper month number!!"
    }
    println("$monthName")
}