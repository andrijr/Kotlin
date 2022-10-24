// funkcje wyższego żędu - haier porter function
fun main(args: Array<String>) {
    var sum = add(5, 10, { x -> "Suma = $x" })
    println(sum)

//    sum = add(5, 10) { "Suma = $it" } // funkcja żeby była przeciążona powinna mieć x -> jak poniżej
//    println(sum)

    sum = add(5, 10) { x -> "Suma = $x" }
    println(sum)

    sum = add(6, 7, fun(x): String { return "Suma = $x" })
    println(sum)

    println(add(10, 22) { x, y, z -> "$x + $y = $z" })
}

// zmienna function , nie chcę żeby ona była prostęgo typu;
// argument zmiennej function Int i chce żeby zmienna function zwracała po lambda String
// funkcja wyższego żędu add i funkcja niższego żędu function jako argument
fun add(a: Int, b: Int, function: (Int) -> String): String {
    return function(a + b)
}

// przeciążanie funkcji można nazwać tak samo bo funkcja ma więcej argumentów
fun add(a: Int, b: Int, function: (Int, Int, Int) -> String): String {
    return function(a, b, a + b)
}