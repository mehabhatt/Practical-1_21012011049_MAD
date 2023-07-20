import java.util.Arrays
fun main(){
    var arr1= arrayOf(12,64,70,45,30)
    println("Array using arrayOf() method: " + Arrays.deepToString(arr1))

    var arr2= Array<Int>()

    println("Array using arrayOf<>() method: "+ Arrays.deepToString(arr2))

    var arr4= IntArray(5)
    arr4[0]=7
    arr4[1]=9
    arr4[2]=11
    arr4[3]=13
    arr4[4]=15
    println("Array using IntArray() method:")
    for(index in 0..arr4.size-1){
        print(" ${arr4[index]}")
    }

    var arr5= intArrayOf(100,300,200,500,600)
    println("\nArray using intArrayof() method:")
    for(i in arr5){
        print(" $i")
    }

    var arr6= arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6))
    println("\n2-D Array using arrayOf() and intArrayOf() method: " + Arrays.deepToString(arr6) )

}