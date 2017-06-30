interface OP {
    fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun div(num1: Int, num2: Int): Int {
        return num1 / num2
    }
}

class User : OP {
    override fun div(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    override fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

class Admin : OP {
    override fun div(num1: Int, num2: Int): Int {
        return num1 / num2 - 2
    }

    override fun sum(num1: Int, num2: Int): Int {
        return num1 + num2 - 2
    }
}

class Manager : OP


fun main(args: Array<String>) {
    println("----User----")
    var user = User()
    println("Sum: ${user.sum(13, 15)}")
    println("Div: ${user.div(45, 9)}")
    println("----Admin----")
    var admin = Admin()
    println("Sum: ${admin.sum(13, 15)}")
    println("Div: ${admin.div(45, 9)}")
    println("----Manager----")
    var manager = Manager()
    println("Sum: ${manager.sum(54, 81)}")
    println("Div: ${manager.div(45, 9)}")
}