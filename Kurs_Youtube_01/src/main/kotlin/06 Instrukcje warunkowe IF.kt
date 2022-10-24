fun main(args: Array<String>) {

    if (5 < 6) {
        println("Prawda")
    } else {
        println("Fałsz")
    }

    if (5 < 6) {
        println("Prawda")
        println("Można dodać drugą linię")
    } else {
        println("Fałsz")
    }

    if (5 < 6)
        println("Prawda można dodać tylko jedną linię bo brak nawiasów klamrowych")
    else
        println("Fałsz jeżeli dodamy bez nawiasów klamrowyh to będzie poza instrukcja")


    println("Podaj liczbę")
    var x = readln()!!.toInt() // !! - oznacza że tutaj nie będzie zwracany typ null
    if (x > 0) {
        println("liczba jest dodatnia")
    } else {
        if (x < 0) {
            println("Liczba jest ujemna")
        } else {
            println("Liczba = 0")
        }
    }

    println("Podaj liczbę")
    var y = readln()!!.toInt() // !! - oznacza że tutaj nie będzie zwracany typ null
    if (y > 0) {
        println("liczba jest dodatnia")
    } else if (y < 0) {
        println("Liczba jest ujemna")
    } else {
        println("Liczba = 0")
    }

}