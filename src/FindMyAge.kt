import java.util.*

/**
 * Find My Age app
 */
fun main(args: Array<String>) {
    //input
    print("Enter your DOB: ")
    var dob: Int = readLine()!!.toInt()
    //process
//    var age = 2017 - dob
    var currentYear = Calendar.getInstance()[Calendar.YEAR]
    var age = currentYear - dob
    //output
    print("Your age is: $age years")
}