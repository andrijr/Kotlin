import kotlin.math.pow

fun main(args: Array<String>) {

    var a = 5
    var b = 2
    var sum = a + b
    println("suma: " + sum)
    println("różnica: " + (a - b))
    println(a - b)
    println("mnożenie: " + (a * b))
    println("dzielenie int: " + (a / b))  // komentarz
    println("dzielenie float: " + (a.toFloat() / b.toFloat()))  // komentarz

    println("reszta z dzielienia : " + (a % b))
    // a / b = 2 ; 2 liczby co sie mięści całych * na 2 to co po prawej = 4 ;
    // 5 to co po lewej odejmujemy to co wyszło i to daje 1


    sum = sum + 1
    println(sum)
    sum += 1
    println(sum)
    sum -= 1
    println(sum)
    sum *= 2
    println(sum)
    sum /= 2
    println(sum)

    var i = 3
    i = i + 1
    println(i)
    i += 1
    println(i)

    //postimplementacja
    println("postimplementacja i=5")
    i++ // dodało 1 do i = 6
    println(i++) // najpierw wyyświetliło poprzedni wynik czyli 6 a pożniej dodało
    println(i) // wyświetłiło to co dodało w poprzednim wierszu

    // preimplementacja
    println("preimplementacja i=7")
    ++i // dodało 1 do i
    println(++i) // najpierw wyyświetliło poprzedni wynik czyli 6 a pożniej dodało
    println(i) // wyświetłiło to co dodało w poprzednim wierszu
    println(--i) // odejmowanie o jeden mniej preimplementajca
    println(++i)

    // potęgowanie trzeba zaimportować pakiety nazw
    println((2.0).pow(3)) // liczba musi być double

    println(kotlin.math.sqrt(9.0))
    println(kotlin.math.sqrt(9F))


}