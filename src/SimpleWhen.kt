fun main(args: Array<String>) {
    print("Enter a number: ")
    var x = readLine()!!.toInt()

    when (x) {
        1 -> print("Value is 1")
        2, 3 -> print("Value is 2 or 3")
        in 10..30 -> print("Value is in range of 10..30")
        !in 10..30 -> print("Value is not in range of 10..30")
        else -> {
            print("Number is out of range")
        }
    }
}