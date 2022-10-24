// konstruktory ich zadanie polega na tym że mogą zabezpieczyć twozony objekt żeby nie miał cech pustych
fun main(args: Array<String>) {
    var p4 = Person4("Sebastjan", 26)
    p4.print()
}

class Person4
{
    // takich konstruktorów może być wiele w klasie
    constructor(name: String, age: Int) // Konstruktor zaraz po nazwie klasy
    {
        this.name = name
        this.age = age
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