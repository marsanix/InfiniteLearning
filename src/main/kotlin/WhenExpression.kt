fun main() {

    var day = 6
    val result = when(day) {
        1, 2, 3, 4, 5 -> "Workday"
        else -> {
            println("Yes! ")
            "Weekend"
        }
    }

    println(result)

}