import java.util.*

fun main(args: Array<String>) {
    // To read input string line we don't need to create scanner object
    // But to read other data type like ints in a line we have to create scanner instance
    print("Enter your name: ")
    var name = readLine()  //Terminal will wait for user to enter the name
    // We can also define the type of variable(literal) or what type of value will hold by a variable
    print("Enter your role: ")
    var role = readLine()

    print("Enter your experience(yrs.): ")
    var exp = readLine()


    print("Enter your department: ")
    var department = readLine()

    println("------Output------")
    println("Name: $name")
    println("Role: $role")
    println("Experience: $exp years")
    println("Department: $department")

}