/**
 * Created by daffolap-402 on 28/6/17.
 */

fun main(args: Array<String>) {
    var name = "Vikas"  //Kotlin will automatically detect the value type
    // We can also define the type of variable(literal) or what type of value will hold by a variable
    var role: String = "Android Developer"

//    var data: String = 12

    var age: Int = 12 // or var age = 12

    var department: String? //We have to define data type as we are not assigning any value to it

    department = "IT Services"
    println("Name: $name")
    println("Role: $role")
    println("Department: $department")

}