import java.nio.channels.AsynchronousByteChannel
import java.security.KeyStore.TrustedCertificateEntry

fun main(args: Array<String>) {

    // Typy danych
    var liczba: Int = 5
    println(liczba)

    println("int max: " + Int.MAX_VALUE)
    println("int min: " + Int.MIN_VALUE)

    var byte: Byte
    println("byte: " + Byte.MAX_VALUE)

    var short: Short
    println("short: " + Short.MAX_VALUE)

    var long: Long
    println("long: " + Long.MAX_VALUE)

    // dodaje ujemne do dodatnich
    var uint: UInt
    println("uint : " + UInt.MAX_VALUE)
    println("uint: " + UInt.MIN_VALUE)

    var float: Float = 33.44f
    println(Float)
    println("float: " + Float.MAX_VALUE)

    var double: Double = 2222.4444
    println(double)
    println("double: " + Double.MAX_VALUE)

    var char: Char = 'A'
    println("czar:" + char)


    var string: String = "tekst"
    println("string: " + String)
    string = string + "ABC"
    println("!$string\nD")

    var bool: Boolean = true
    println(bool)
    bool = !bool
    println(bool)


}