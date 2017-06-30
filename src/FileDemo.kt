import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    println("1- Read\n2-Write")
    var operation = readLine()!!.toInt()
    when (operation) {
        1 -> readFromFile()
        2 -> {
            println("Write your message to save in file:")
            var string: String = readLine()!!.toString()
            writeToFile(string)
        }
        else -> println("Invalid operation")
    }
}

fun writeToFile(string: String) {
    try {
        var writer = FileWriter("welcome.txt", true)// true append data if file exists
        writer.write("$string\n")
        writer.close()
    } catch (ex: Exception) {
        println("Error: ${ex.message}")
    }
}

fun readFromFile() {
    try {
        var reader = FileReader("welcome.txt")
        var c: Int = reader.read()
        while (c != -1) {
            print(c.toChar())
            c = reader.read()
        }
    } catch (ex: Exception) {
        println("Error: ${ex.message}")
    }
}