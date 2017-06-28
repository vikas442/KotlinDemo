
fun main(args: Array<String>){
    for(index in 1..10){
        if (index == 4)
            continue
        if (index==7)
            break
        if (index==9)
            return
        println("Index: $index")
    }
}