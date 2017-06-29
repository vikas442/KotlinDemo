fun sum(num1: Double, num2: Double): Double { //parametrized function
    return num1 + num2
}

fun display(num:Int=0):Unit{ //optional parametrized function
    println("Number: $num")
}

fun welcomeUser():Unit{
    println("Welcome to the world of Kotlin")
}

fun main(args: Array<String>) {
    welcomeUser()

    print("Enter num 1: ")
    var num1 = readLine()!!.toDouble()
    print("Enter num 2: ")
    var num2 = readLine()!!.toDouble()

    println("The sum is: ${sum(num1, num2)}")

    display(34)
    display()
}