fun main(args: Array<String>) {
    print("Enter num2: ")
    try {
        var num2: Int = readLine()!!.toInt()
        var div = 100 / num2
        println("Div: $div")
    } catch (ex: Exception) {
        println("Error: ${ex.message}")
    }
    println("Done!!")
}