class Singleton {
    var name: String? = null

    private constructor() {
        println("Instance created")
    }

    companion object {
        val instance: Singleton by lazy { Singleton() } // Lazy block runs only once,
        // so if we are trying to get instance second time it will simply return created first time
    }
}

fun main(args: Array<String>) {
    var s1 = Singleton.instance
    s1.name = "Vikas"
    println(s1.name)
    var s2 = Singleton.instance
    println(s2.name)
}