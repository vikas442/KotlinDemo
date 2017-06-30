open class Operations1(name: String = "Default process") {

    var processName: String? = null // By default its access is public
    //We can change its visiblity to protected or private

    init {
        processName = name
    }

    open fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun div(num1: Int, num2: Int): Int {
        return num1 / num2
    }

}

class MultiOperations1 : Operations1() {

    override fun sum(num1: Int, num2: Int): Int {
        return num1 + num2 * 2
    }

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
    var operations = Operations1("Simple Operations")
    var sum = operations.sum(12, 14)
    var div = operations.div(6, 3)

    println("Sum: $sum")
    println("Division: $div")

    println("Process name: ${operations.processName}")

    var mOperations = MultiOperations1()
    sum = mOperations.sum(13, 19)
    div = mOperations.div(13, 17)

    println("Sum: $sum")
    println("Division: $div")
    println("Process name: ${mOperations.getName()}")
    //Typecasting

    var op = mOperations as Operations1
    //Now it will show only two methods of Operation1 class
    op.sum(12, 14)
    op.div(56, 8)
}