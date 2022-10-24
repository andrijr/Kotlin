fun main(args: Array<String>) {
    // aby dziedziczyć potrzebne jest conajmniej 2 klasy
    var animal2 = Animal2("Felix")
//    var cat2 = Cat2()
//    cat2.name = "Milka"
//    cat2.print()

//    cat2.color = "White"
//    animal2.name = ""
//    var lion2 = Lion2()
//    lion2.print()

}

open class Animal2(name: String)  // konstruktor name typu STring
{
    var name = name
    fun print() {
        println("My name is: $name")
    }
}

//open class Cat2 : Animal2(name: "Imię") // clasa Cat() dziedziczy po klasie Animal() która powinna być otwarta czyli open class Animal()
//{
//    var color = ""
//}

//class  Lion2() : Animal2() // clasa Cat() dziedziczy po klasie Animal() która powinna być otwarta czyli open class Animal()
//{
//    var lion = ""
//}

