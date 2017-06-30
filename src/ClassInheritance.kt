open class Operations(name: String = "Default process") {

    var processName: String? = null // By default its access is public
    //We can change its visiblity to protected or private

    init {
        processName = name
    }

    fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun div(num1: Int, num2: Int): Int {
        return num1 / num2
    }

}

class MultiOperations : Operations() {

    fun sub(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun mul(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun getName(): String? {
        return super.processName
    }
}

fun main(args: Array<String>) {
    var operations = Operations("Simple Operations")
    var sum = operations.sum(12, 14)
    var div = operations.div(6, 3)

    println("Sum: $sum")
    println("Division: $div")

    println("Process name: ${operations.processName}")

    var mOperations = MultiOperations()
    sum = mOperations.sum(13, 19)
    div = mOperations.div(13, 17)

    println("Sum: $sum")
    println("Division: $div")
    println("Process name: ${mOperations.getName()}")
}