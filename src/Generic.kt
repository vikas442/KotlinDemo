class UserAdmins<T>(credit: T) {
    init {
        println(credit)
    }
}

fun <T> display(data: T) {
    println(data)
}

fun main(args: Array<String>) {
    var admin1 = UserAdmins("Vikas")
    var admin2 = UserAdmins(1793)

    display("Generics")
}