fun main(args: Array<String>) {
    var title = " Welcome to world of Kotlin!! "

    println(title)
    println("Title: " + title)
    println("Title: $title")

    var name = " Vikas" + "Verma"
    println("Name: $name")

    println("Second Char: ${title[1]}")

    println("Lower case: ${title.toLowerCase()}")
    println("Upper case: ${title.toUpperCase()}")
    println("Split by space: ${title.split(" ")}")
    println("Trim: ${title.trim()}")
}