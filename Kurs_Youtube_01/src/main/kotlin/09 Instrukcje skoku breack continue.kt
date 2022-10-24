fun main(args: Array<String>) {
    println("breack")
    var i = 0
    while (i < 10 || true)  // || true tend dodakowy warunek logiczny sprawia że pętla staję się nieskączona
    {
        if (i >= 10)
            break // przerywa pętle while i kończe jej działanie
        println("i: $i")
        i++
    }

    println("continue")
    var j = 0
    while (j < 20) {
        j++
        if (j % 2 == 1) // reszta = 1 liczba jest niepażysta a dla reszata = 0 liczba jest pażysta
        {
            continue // wykonuję dalej naszą pętle while ale przechodzi do kolejnego obiegu kolejnego krokuu wykonania naszej pętli
            // od miejsca w który napotkało słowo continue
        }
        println("j: $j")
    }


}