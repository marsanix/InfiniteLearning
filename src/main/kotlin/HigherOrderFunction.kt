
abstract class Human(val name: String) {
    abstract var age: Int
    abstract var dateOfBirth: String

    fun humanDetails() {
        println("Name of the human: $name")
        println("Age: $age")
    }
}

class Student(name: String): Human(name) {
    override var age: Int = 24
    override var dateOfBirth = ""
}

fun main() {
    var student1 = Student("Reza")
    student1.humanDetails()

    var student2 = Student("Ardy")
    student2.humanDetails()

}



