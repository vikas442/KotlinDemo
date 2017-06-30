data class NewUser(val name: String, val age: Int) {
    override fun toString(): String {
        return "{Name: $name, Age:$age}"
    }
}

fun main(args: Array<String>) {
    val list = ArrayList<NewUser>()

    list.add(NewUser("Vikas", 23))
    list.add(NewUser("Jini", 18))
    list.add(NewUser("Trisha", 20))

    println(list)

    //Search user with age 20
    var user: NewUser? = null
    for (data in list) {
        if (data.age == 20) {
            user = data
        }
    }
    println(user?.toString())
    //Search user with age 20 using lambda expression

    val user1: NewUser? = list.lastOrNull { it.age == 20 }
    println(user1?.toString())

}