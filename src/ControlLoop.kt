
fun main(args: Array<String>){
    for(index in 1..10){
        if (index == 4)
            continue
        if (index==7)
            break
        println("Index: $index")
    }

    loop@for (count in 1..10){ //Here we are labeling the loop
        for (count2 in 1..5){
            println("Count: $count")
            if(count2==2)
                break@loop  //Now it will break the outer loop with label 'loopR'
        }
    }
}