fun main(args: Array<String>) {

    var array = Array<Int>(5) { 0 }

    println("Array[4]: ${array[3]}")
    println("Setting 55 at array[4]")
    array[3] = 55
    println("Array[4]: ${array[3]}")

    println("All elements by object")
    for (element in array) {
        println(element)
    }
    println("All elements by index")
    for (index in 0..array.size-1){
        println("At index $index: ${array[index]}")
    }


    var arrayStr = Array<String>(4){""}
    for (index in 0..arrayStr.size-1){
        print("Enter string for position $index: ")
        arrayStr[index] = readLine()!!
    }

    println("All string elements by object")
    for (element in arrayStr) {
        println(element)
    }
}