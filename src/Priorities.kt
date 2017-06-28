/**
 * Operations | Priorities rules
 * 1. ()
 * 2. ^
 * 3. /, *
 * 4. +, -
 * 5. =
 */
fun main(args: Array<String>) {
    var n1: Int = 15
    var n2: Int = 10
    var n3: Int = 5
    var n4: Int = 6
    var result: Int?
//    result = n1 + n2 * n3 - n4
    result = (n1 + n2) * n3 - n4

    print("Result: $result")
}