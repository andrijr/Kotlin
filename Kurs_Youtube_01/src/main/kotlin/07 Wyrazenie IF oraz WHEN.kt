fun main(args: Array<String>) {

    var x: Int = 5

    // trójargumentowe wyrażenie - skrócony operator warunkowy któy zwraca albo prawdę albo falsz
    // val res = x >= 0 ? "Dodatnia" : "Ujemna"
    // if expression
    val res = if (x >= 0) {
        println("teskst..."); "Dodatnia";3
    } else "Ujemna"
    // skrócone wyrażenie if zawsze zwraca to co jest ostatnią instrukcją kodu
    println(res)

    // if expression
    val res2 = if (x >= 0) "Dodatnia" else "Ujemna"
    println(res2)


    // when
    var res3 = when {
        x > 0 -> "Dodatnia"
        x == 0 -> "Równa 0"
        else -> "Ujemna"
    }
    println("Wynik when: " + res3)

    // swithc
    when (x) {
        1 -> println("Jeden")
        2 -> println("Dwa")
        3 -> println("Trzy")
        else -> println("nieznana")
    }

    when (x) {
        1 -> println("Jeden")
        2 -> println("Dwa")
        3 -> println("Trzy")
        else -> {
            println("nieznana"); println("Tekst ...")
        }
    }

}