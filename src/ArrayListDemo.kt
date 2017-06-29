fun main(args: Array<String>) {

    var names = ArrayList<String>();

    names.add("Vikas")
    names.add("Mohit")
    names.add("Sams")
    names.add("Nishant")

    println("First name: ${names[0]}")

    println("All elements by object")
    for (name in names) {
        println(name)
    }

    println("All elements by index")
    for (index in 0..names.size-1) {
        println(names[index])
    }

    //Update

    names[0]="Vikas Verma" // or names.set(0,"Vikas Verma")
    println("First name: ${names[0]}")

    //Search

    if (names.contains("Sams")){
        println("Name found")
    }else{
        println("Name not found")
    }


}