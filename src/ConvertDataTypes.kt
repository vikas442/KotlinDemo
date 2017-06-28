/**
 * Created by daffolap-402 on 28/6/17.
 */


fun main(args: Array<String>) {
    var num1: Int = 10
    var num2: Int?
    var str = "12"

    num2 = str.toInt()

    var float1: Float?

    float1 = str.toFloat()

    println("Num1: $num1")
    println("Num2: $num2")
    println("Float1: $float1")

    var xPI: Double = 3.14
    var intPI: Int = xPI.toInt()

    println("IntPI: $intPI")
}