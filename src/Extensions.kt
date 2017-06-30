fun ArrayList<String>.swap(index1: Int, index2: Int) {
    var temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun main(args: Array<String>) {
    var list = ArrayList<String>()

    list.add("Vikas")
    list.add("Jini")
    list.add("Trisha")

    println(list)

    //There are more predefined methods to ArrayList class
    // We can add more methods to this ArrayList class

    //We have created extension method swap
    //Lts call it
    list.swap(0, 1)

    println(list)
}