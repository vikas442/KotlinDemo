abstract class CreditCard {
    fun creditID(): String {
        return "1234567890123456"
    }

    abstract fun newInfo()
}

class UserInfo : CreditCard() {
    fun getInfo(): String {
        return creditID()
    }

    override fun newInfo() {
        println("New info called")
    }
}

fun main(args: Array<String>) {
//    var cc = CreditCard()
//    println("CC number: ${cc.creditID()}")
    var ui = UserInfo()
    println("CC number: ${ui.getInfo()}")
    ui.newInfo()
}