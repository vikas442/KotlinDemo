fun main(args: Array<String>) {
    var map = hashMapOf(1 to "Vikas Verma", 2 to "Ramanna", 3 to "Trisha")
    map.put(4, "Jini")

    println("map[3]: ${map[3]}")

    var array = arrayOf(1, 2, 3, 4)
    println("array[3]: ${array[3]}")

    var list = listOf(11,12,13,14)  //List is immutable, so it doesn't support update after defining. If we want to do so we have to use mutable list
println("Immutable list")
    for (element in list){
        println(element)
    }

    var mutableList = mutableListOf(11,2,44,13)
    println("mutable list")
    for (element in mutableList){
        println(element)
    }
    mutableList[3]=32
    println("mutable list after update for mutableList[4]")
    for (element in mutableList){
        println(element)
    }

    var arrayList = arrayListOf<String>() //or arrayListOf("str1", "str2",........)
}