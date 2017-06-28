//Function with same name but different type of parameters

fun show(name: String) {
    println("Name: $name")
}

fun show(number: Int) {
    println("Number: $number")
}

fun show(number: Double) {
    println("Number: $number")
}

fun show(number: Float) {
    println("Number: $number")
}

fun main(args: Array<String>) {
    show("Vikas Verma")
    show(23)
    show(25.5)
    show(24.0f)
}