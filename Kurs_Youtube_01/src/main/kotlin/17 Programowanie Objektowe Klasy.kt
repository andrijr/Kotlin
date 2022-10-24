// jeden sposób aby jedna klasa odpowiadała jednemu w plikowi w hierarhii plików
// w javie każda klasa jest nowym plikiem kotlin dopuszcza wiele klas w jednym pliku ale stosuję sie zazwyczaj jedna klasa w 1 pliku

// klasa mówi jak objekt ma wygłądać jest to ogólny wzór
// Klsase nazywamy z Dużej litery natomiast funkcje z małej litery
// Klasa to zbór zmiennych (pól)

fun main(args: Array<String>) {
    var osoba1 = Person() // tworzę objekt na bazie klasy Person
    osoba1.name = "Andrij"
    osoba1.age = 18
    println(osoba1.name) // zmienna osoba1 i po kropce wybieramy zwane (element , pole, metoda ...)
    println(osoba1.age)
    osoba1.print()

    var osoba2 = Person()
    osoba2.name = "Tomek"
    osoba2.age = 30
    osoba2.print()
}

class Person {
    var name: String = ""
    var age = 0
    fun print() // funkcje w clasie to są metody
    {
        println("Imię: $name, wiek: $age")
    }
}
