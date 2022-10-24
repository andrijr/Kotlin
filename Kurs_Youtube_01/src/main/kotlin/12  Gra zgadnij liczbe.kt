import kotlin.random.Random

fun main(args: Array<String>) {

    println(Random.nextInt())

    println("----")
    for (i in 1..30) {
        println(Random.nextInt())
    }

    println("----")
    for (i in 1..30) {
        println(Random.nextInt(until = 5)) // od 0 do 4
    }

    println("----")
    for (i in 1..30) {
        println(Random.nextInt(from = 1, until = 5)) // od 1 do 5 włącznie
    }

    println("----")
    for (i in 1..30) {
        println((1..10).random()) // od 1 do 10 włącznie
    }


    println("----Gra----")
    val x = Random.nextInt(from = 1, until = 11)
    var a: Int
    var i = 0
    println("Zgadnij liczbę od 1 do 10")

    // wybiera do while poniewważ najpier wczytamy liczbę a później przechodzimy do sprawdzania
    do {
        i++
        println("Podaj liczbę: ")
        a = readLine()!!.toInt()
        if (x > a) println("liczba jest większa")
        else if (x < a) println("liczba jest mniejsza")

    } while (x != a)

    println("Brawo zgadłeś liczbe $x za $i razem")

}