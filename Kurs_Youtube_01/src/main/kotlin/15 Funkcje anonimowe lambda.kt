fun main(args: Array<String>)
{
    // funkcje anonimowe budujemy wtedy gdzy chcemy użyć funkcji bez podawania jej nazwy
    // funkjca anonimowa hello
    var hello = { println("Hello World") }
    hello()
    var hello2 = { println("Hello World"); println("Dziękuję świecie") }
    hello2()

    var add: (Int, Int) -> Int = {a, b -> a + b} // -> funkcja strzałkowa związana z lambdą
    println(add(2, 5))

    var add2 = fun(a: Int, b: Int): Int { return a + b} // funkcja return
    println(add2(2, 5))

    // funkcja lambda
    var sub = {a: Int, b: Int -> a - b} // funkja lambda jeszcze krótsza
    println(sub(10, 7))

    // funkcja lambda dla każdego elementu
    println("-----2")
    var arr = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    var function = {a: Int -> println(a * a) }
    arr.forEach(){function(it)} // it pobież pojedynczy element z listy
    // po forEach można pominąć nawiasy okrągłe bo funkcja niema żadnych argumentów

    // funkcja lambda dla każdego elementu jeszcze krótsza
    println("-----3")
    arr.forEach(){item -> println( item * item)}
    arr.forEach{item -> println( item * item)}

    // funkcja
    println("-----4")
    arr.filter(fun(item) = item % 2 == 0).forEach{i -> println(i)}
    arr.filter(fun(item) = item % 2 == 0).forEach{ println(it)}


}