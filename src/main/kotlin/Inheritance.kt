
open class Manusia1(nama: String, umur: Int = 0) {
    var name = nama
    fun makan() {
        println("$name sedang makan...")
    }
}

class Murid(nama: String): Manusia1(nama) {

}

fun main() {
    var murid = Murid("Hasan")
    murid.makan()
}