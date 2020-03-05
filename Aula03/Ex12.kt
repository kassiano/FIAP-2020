import java.util.*

fun valorPN(n: Int): String {
    var resp: String = ""
    if (n > 0) {
        resp = "Positivo"
    } else if (n < 0) {
        resp = "Negativo"
    } else {
        resp = "Zero"
    }

    return resp
}

fun main() {
    val e = Scanner(System.`in`)
    println("Digite um valor inteiro qualquer")
    val n = e.nextInt()

    println("${valorPN(n)}")
}