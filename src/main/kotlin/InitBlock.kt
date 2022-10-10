
class Person (val _name: String, val _age: Int = 28) {

    var name: String? = null
    var age: Int? = null

    init {
        this.name = _name
        this.age = _age
    }

}

fun main() {
    val person = Person("Zara")
    println(person.name)
    println(person.age)
}