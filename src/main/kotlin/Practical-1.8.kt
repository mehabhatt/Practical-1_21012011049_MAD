import java.util.Arrays
fun main() {
    println("21012011049_Meha Bhatt")
    var arr1 = arrayOf(12, 64, 70, 45, 30)
    println("Array using arrayOf() method: \n" + Arrays.deepToString(arr1))

    var arr2 = Array<Int>(5) { 0 }
    println("Array using Array<>() method: \n" + Arrays.deepToString(arr2))

    val arr3 = Array(7) { index -> (index + 1) * 5 }
    println("Array using Array<>() method and lambda function: \n" + Arrays.deepToString(arr3))

    var arr4 = IntArray(5)
    arr4[0] = 7
    arr4[1] = 9
    arr4[2] = 11
    arr4[3] = 13
    arr4[4] = 15
    println("Array using IntArray() method:")
    for (index in 0..arr4.size - 1) {
        print(" ${arr4[index]} ")
    }

    var arr5 = intArrayOf(100, 300, 200, 500, 600)
    println("\nArray using intArrayof() method:")
    for (i in arr5) {
        print(" $i")
    }

    var arr6 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6))
    println("\n2-D Array using arrayOf() and intArrayOf() method: \n" + Arrays.deepToString(arr6))

    println("Please enter array values:")
    var arr7 = ArrayList<Int>()
    for (i in 0 until 5) {
        print("arr[$i]: ")
        arr7.add(readLine()!!.toInt())
    }
    println("Entered Array: $arr7")
    println("************Sorting with built-in function************")
    println("Array before sorting: $arr7")
    var sort_arr=arr7.sort()
    println("Array after sorting: " + arr7.joinToString())

    println("\n************Sorting without built-in function************")
    println("Array before sorting:" + Arrays.deepToString(arr1))
    for (i in 0 until arr1.size - 1) {
        for (j in 0 until arr1.size - i - 1) {
            if (arr1[j] > arr1[j + 1]) {
                val temp = arr1[j]
                arr1[j] = arr1[j + 1]
                arr1[j + 1] = temp
            }
        }
    }
    println("Array after sorting: "+ arr1.joinToString())
}