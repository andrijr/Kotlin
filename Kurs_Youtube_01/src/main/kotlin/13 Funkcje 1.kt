fun main(args: Array<String>) {
    hello()
    hello2("Sebastian")
    add(5, 6)
    add(5, 6)
}

fun hello() {
    // ciało funkcji
    println("Hello World")
}

fun hello2(name: String) {
    // ciało funkcji
    println("Hello $name!")
}

fun add(a: Int, b: Int, c: Int = 0) {
    println("Suma 3 args =  ${a + b + c}")
}

// druga funkcja może nazywać się tak samo jeżeli jest różna ilość argumentów lub różny typ danych
fun add(a: Int, b: Int, c: Int = 0, d: Int = 0) {
    println("Suma 4 args =  ${a + b + c + d}")
}