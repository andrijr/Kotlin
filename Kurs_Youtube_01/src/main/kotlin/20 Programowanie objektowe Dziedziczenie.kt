fun main(args: Array<String>) {
    // aby dziedziczyć potrzebne jest conajmniej 2 klasy
    var animal = Animal()
    var cat = Cat()
    animal.name = ""
    cat.name = "Milka"
    cat.color = "White"
    cat.print()
    var lion = Lion()
    lion.print()

}

open class Animal() // słówko open oznacza że ta klasa nie jest ostateczna że po niej są dziedziczone inne klasy // konstruktor name typu STring
{
    var name = ""
    fun print()
    {
        println("My name is: $name")
    }
}

open class  Cat() : Animal() // clasa Cat() dziedziczy po klasie Animal() która powinna być otwarta czyli open class Animal()
{
    var color = ""
}

class  Lion() : Animal() // clasa Cat() dziedziczy po klasie Animal() która powinna być otwarta czyli open class Animal()
{
    var lion = ""
}

