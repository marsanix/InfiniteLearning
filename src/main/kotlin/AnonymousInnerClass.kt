fun main() {
    var programmer: HumanBeing = object:HumanBeing {
        override var name: String? = "Reza"
        override fun think() {
            println("Coding...")
        }
    }
    programmer.think()


    var designer: HumanBeing = object:HumanBeing {
        override var name: String? = null
        override fun think() {
            println("Figma hi-fi prototype, besok pitstop")
        }
    }
    designer.think()

}

interface HumanBeing {
    var name: String?
    fun think()
}