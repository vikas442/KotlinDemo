/*
Math calculator
 */
fun main(args: Array<String>) {
    println("***Math Calculator***")
//    var n1 = 10
//    var n2 = 15

    //Make dynamic
    print("Enter num1: ")
    var n1 = readLine()!!.toFloat()
    print("Enter num2: ")
    var n2 = readLine()!!.toFloat()
    var sum: Float?
    sum = n1 + n2
    println("Sum: $sum")
}
