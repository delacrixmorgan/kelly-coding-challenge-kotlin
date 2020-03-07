fun main() {
    println("Welcome to Kelly's Coding Challenge!")
    print("Enter your name: ")

    var name: String? = readLine()

    if (name.isNullOrBlank()) {
        name = "Player One"
    }

    println("\nHello and Welcome, $name!")
}