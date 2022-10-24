fun main(args: Array<String>) {
    var p5 = Person5("Andrij", 33) // pszypisanie instancji klasy person
    p5.name = "Adam"
    p5.age -= 50 // to jest moment set
    p5.print()
    println(p5.age) // to jest moment get
    println(p5.name) // to jest moment get

}

// hermetyzacja - ukrywanie zmiennych przed swiatem zewnętrznym czyli innymi klasami  a wystawianie metod
class Person5 {
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    var name: String
        get() = field.uppercase()
        //get() = { return field.uppercase()}
        // get i set jak nawet nie podamy jest domyślny i jest domyślnie w tle

    var age: Int
        // pobierz (dostęp) - wstawiamy ją poniżej zmiennej do której ta metode get się odnosi ( field domyślna implementacja) (field zawiera zmienną do której zostało przypisane)
        // w field po kropce można dodać jeszcze jakąś funkcję
        get() = field
        // przy zapisie w {} możemy przypisać więcej operacji dla  zmiennej nastepnie zwrócić do field (więcej  wartości i cos z nim zrobić)
        //get() { field + 1; return field }
        set(value)
        {
            if (value < 0 )
                field = 0
            else
                field = value
        }
        // set przyjmuję wartość którą użytkownik probuję przypisać
        // set w nawiasach okrągłych przyjmuję już argument który według konwencji nazywa się value
        // { field = value } domyślne przeciązenie metody set jej działanie się nie zmieniło

    fun print() {
        println("Imię: $name, wiek: $age")
    }
}