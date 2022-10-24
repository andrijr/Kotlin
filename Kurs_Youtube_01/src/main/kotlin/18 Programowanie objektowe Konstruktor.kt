// konstruktory ich zadanie polega na tym że mogą zabezpieczyć twozony objekt żeby nie miał cech pustych
fun main(args: Array<String>) {
    var p1 = Person2("Sebastjan", 26)
    p1.print()
    var p2 = Person3("Sebastjan", 26)
    p2.print()
}


class Person2(n: String, a: Int) // Konstruktor zaraz po nazwie klasy
{
    var name = n
    var age = a
    fun print() // funkcje w clasie to są metody
    {
        println("Imię: $name, wiek: $age")
    }
}

// drugi sposób utworzenia konstruktora
class Person3
{
    // takich konstruktorów może być wiele w klasie
    constructor(n: String, a: Int) // Konstruktor zaraz po nazwie klasy
    {
        name = n
        age = a
    }

    constructor(n: String,) // Konstruktor zaraz po nazwie klasy
    {
        name = n
    }
    var name : String
    var age : Int = 0
    fun print() // funkcje w clasie to są metody
    {
        println("Imię: $name, wiek: $age")
    }
}