fun main(args: Array<String>) {
    var x: Int = add(5, 5)
    println(x)
}

fun add(a: Int, b: Int): Int {
    var x = a + b
    println("test1")
    return x // instrukcja skoku podobna do breack i continue
    // po ritern println już nie zostanie wyświetlony tylko przed
    println("test2")
}