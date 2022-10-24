fun main(args: Array<String>) {
    var array1: Array<Any> = arrayOf(1, 2, 3, "4", "5")
    var array2: Array<*> = arrayOf(1, 2, 3, "4", "5")
    var array5 = arrayOf(1, 2, 3, 4, 5) // skrócony sposób zapisu typu Int
    var array3: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    var array4 = intArrayOf(1, 2, 3, 4, 5)
    // var array4: IntArray = intArrayOf(1, 2, 3, 4, 5) // klasa IntA rray
    var array7 = longArrayOf(1, 2, 3, 4, 5)
    var array8 = IntArray(4)
    var array9 = Array(5, { i -> i }) // wywołanie konstruktora klasy Array i dwie wartości rozmiar i zbór wartości
    // jak zbór wartości użyjemy lambda expression
    var array10 = Array(5, { i -> (i + 1) * 2 })

    // zapisanie wartości do konkretnego indeksu
    array10.set(0, 22)
    array10[1] = 100

    for (n in array9) {
        // ciało pętli
        println(n)
    }

    // indeksy tablicy
    for (n in array9.indices) {
        // ciało pętli
        println(n)
    }

    // indeksy i wartości tablicy
    for (n in array10.indices) {
        // ciało pętli
        println(n.toString() + " : " + array10[n])
    }

    // wyświetlenie indeksu tablicy
    println("Index 0: " + array10[0])
    println("Index 1: " + array10.get(1))

    // rozmiar tablicy
    println("Rozmiar tablicy: " + array10.size)


}