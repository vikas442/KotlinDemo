enum class Direction {
    EAST,
    WEST,
    NORTH,
    SOUTH
}

fun main(args: Array<String>) {
    var direction = Direction.NORTH

    when (direction) {
        Direction.NORTH -> println("I am going to North")
        Direction.SOUTH -> println("I am going to South")
        Direction.EAST -> println("I am going to East")
        Direction.WEST -> println("I am going to West")
    }
}