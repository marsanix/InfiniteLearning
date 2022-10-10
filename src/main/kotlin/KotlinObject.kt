open class Manusia() {
    var nama: String? = null
    fun makan() {
        println("$nama sedang makan")
    }
}

fun main() {
    var mentor = Manusia()

    mentor.nama = "Reeza"
    mentor.makan()
}