fun main(args: Array<String>){
    var set = setOf(12,13,14,15,15)// In sets we can not repeat element, if we do it will automatically neglected

    println("Elements")
    for (element in set){
        println(element)
    }

    var mutableSet = mutableSetOf(12,13,14,15,15)
}