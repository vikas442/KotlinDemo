
fun main(args:Array<String>){
    var map=HashMap<Int, String>()

    map.put(1,"Vikas Verma")
    map.put(2,"Ramanna")
    map.put(3,"Trisha")

    println("elements by key")
    for (key in map.keys){
        println("map[$key]: ${map[key]}")
    }

    //or

    println("elements by value")
    for (value in map.values){
        println(value)
    }

    //or

    println("elements by (key,value) pair")
    for ((key,value) in map){
        println("map[$key]: $value")
    }
}