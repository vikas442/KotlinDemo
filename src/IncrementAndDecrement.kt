/**
 * Operations | Priorities rules
 * 1. ()
 * 2. ++, -- (before variable)
 * 3. ^
 * 4. /, *
 * 5. +, -
 * 6. =
 * 7. ++, -- (after variable)
 */
fun main(args: Array<String>) {
    var x = 10
    var y = 11
    var z = ++x + y  // (++x) = (x=x+1) and (--x) = (x=x-1)
    var z2= x--+y
    println(z)
    println(z2)
    println(x)
}