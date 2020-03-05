import java.util.*

fun parImpar(n: Int): String {
    val status: String

    if (n.rem(2) != 0) {
        status = "Ímpar"
    } else {
        status = "Par"
    }
    return status
}

fun main() {
    println("DIgite um numero inteiro")
    val e = Scanner(System.`in`)
    val c = e.nextInt()
    println("${parImpar(c)}")

}