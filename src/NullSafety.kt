/**
 * Created by daffolap-402 on 28/6/17.
 */

fun main(args: Array<String>) {
//    var name: String
//    name = "Vikas Verma"
    var name: String?
    name = null
    println("Name: $name") // It prints null
    //But if we want that variable name must have to have a real value we use'!!'

//    println("Name: " + name!!) // This line will throw KotlinNullPointerException

    println("Name: ${name ?: "name is null"}") // This line will throw KotlinNullPointerException
}