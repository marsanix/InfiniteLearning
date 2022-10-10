fun main() {
    val company = NDP()
    val innerCompany = company.Infinite()

    print(innerCompany.welcome())
}

class NDP {
    val welcomeMessage = "Welcome to The Infinite Learning!"
    inner class Infinite {
        fun welcome() = welcomeMessage
    }
}

