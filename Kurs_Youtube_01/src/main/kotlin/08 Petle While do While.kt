fun main(args: Array<String>) {
    // zagnieżdżenie while
    var i = 0
    var j = 0
    while (i < 10) {
        i++
        j = 0
        // pętla wewnętrzna
        while (j < 10) {
            println("i: $i, j: $j")
            j++
        }
    }


    // Pętla  while
    println("Pętla while")
    var k = 10
    while (k < 10) {
        println("k: $k")
        k++
    }


    // Pętla  do while gwarantuję wykonanie conajmniej jednego wykonania pętli
    println("Pętla do while")
    var l = 10
    do { // ciało
        println("l: $l")
        l++
    } while (l < 10)// warunek


}