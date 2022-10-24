fun main(args: Array<String>) {

    // komentarz jednolinijkowy

    /* komentarz
       wielolinijkowy
    */

    println("Hello World!")

    // wydruk bez nowej linii
    print("Hello World!")

    // przeniesienie na nową linie
    println("Hello \nWorld!")

    // tworzymy zmienną
    var nazwaZmiennej: String = "Andrij"
    println("Hello $nazwaZmiennej")

    // tworzymy zmienną stalą
    val nazwaZmiennejStalej: String = "Andrij"
    println("Hello $nazwaZmiennejStalej")

    // interaktywne przypisanie do zmiennej przez użytkownika
    println("Podaj Imię: ")
    var nazwaZmiennej2: String = readLine().toString()
    println("Hello $nazwaZmiennej2")

    // interaktywne przypisanie do zmiennej przez użytkownika można pominać określenie typu zmiennej bo pożniej jest toString
    // i porogram domyśla się jaki jest typ zmiennej i już nie można jej zmieniać
    println("Podaj Imię: ")
    var nazwaZmiennej3 = readLine().toString()
    println("Hello $nazwaZmiennej3")


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

}

