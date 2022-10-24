fun main(args: Array<String>) {
    // pętla for jest typowo objektowa
    var arr = arrayOf(5, 10, 15)
    for (i in arr) {
        println("i: " + i)
    }

    var arr2 = arrayOf(5, 10, 15)
    for (i in arr2.withIndex()) {
        println(i)
    }

    var arr3 = arrayOf(5, 10, 15)
    for ((i, v) in arr3.withIndex()) {
        println("$i: $v")
    }

    for (i in "KOTLIN") // char charArrayOf('K', 'O', ...
    {
        println(i)
    }

    // index tekstu
    println("Tekst"[4])

    println("----------")
    for (i in 1..10) // w Python to jest Range // .. włącznie natomiast until to bez ostatniego znaku (implementacja)
    {
        println(i)
    }
    println("----------")
    for (i in 1 until 10) // w Python to jest Range // .. włącznie natomiast until to bez ostatniego znaku (implementacja)
    {
        println(i)
    }
    println("----------")
    for (i in 10 downTo 1) // downTo iteruje od większego do mniejszego (deklamentacja)
    {
        println(i)
    }
    println("----------")
    for (i in 2..10 step 2) // step czyli krok
    {
        println(i)
    }


}