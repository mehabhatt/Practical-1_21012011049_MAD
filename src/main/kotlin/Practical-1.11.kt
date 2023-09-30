fun main() {
    println("21012011049_Meha Bhatt\n")
    val firstMatrix = Matrix(arrayOf(intArrayOf(2,-4,3), intArrayOf(6,0,5), intArrayOf(3,7,5)),3,3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(7,3,5),intArrayOf(0,-4,7), intArrayOf(1,3,6)),3,3)
    println("********** Addition **********")
    println("Matrix:1 ")
    print(firstMatrix.toString())
    println("Matrix:2 ")
    print(secondMatrix.toString())
    val thirdMatrix = firstMatrix + secondMatrix
    println("Addition: \n$thirdMatrix")
    println("********** Subtraction **********")
    println("Matrix:1 ")
    print(firstMatrix)
    println("Matrix:2 ")
    print(secondMatrix)
    val subtractMatrix = firstMatrix - secondMatrix
    println("Subtraction: \n$subtractMatrix")
    println("********** Multiplication **********")
    println("Matrix:1 ")
    print(firstMatrix.toString())
    println("Matrix:2 ")
    print(secondMatrix.toString())
    val multiplication = firstMatrix * secondMatrix
    println("Multiplication: \n$multiplication")
}

class Matrix(matrix: Array<IntArray>,i:Int,j:Int){
    var i:Int
    var j:Int
    lateinit var matrix : Array<IntArray>
    init{
        this.i = i
        this.j = j
        this.matrix = matrix
    }
    operator fun plus(p: Matrix) : Matrix {
        val result = Array(i){IntArray(j)}
        for(row in 0 until i){

            for(column in 0 until j){
                result[row][column] = matrix[row][column] + p.matrix[row][column]
            }
        }
        return Matrix(result,i,j)
    }

    operator fun minus(p:Matrix):Matrix{
        val result = Array(i){IntArray(j)}
        for(row in 0 until i){
            for(column in 0 until j){
                result[row][column] = matrix[row][column] - p.matrix[row][column]
            }
        }
        return Matrix(result,i,j)
    }

    operator fun times(p:Matrix):Matrix{
        val result = Array(i){IntArray(i)}
        for(row in 0 until i){
            for(column in 0 until i){
                for(k in 0 until j){
                    result[row][column] += matrix[row][k] * p.matrix[k][column]
                }
            }
        }
        return Matrix(result,i,i)
    }

    override fun toString(): String {
        var msg : String = ""

        for(row in matrix.indices){
            for(column in 0 until matrix[row].size){
                msg += "${matrix[row][column]} "
            }
            msg += "\n"
        }
        return msg
    }
}