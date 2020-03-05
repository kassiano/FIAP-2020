import java.util.*

fun soma(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun main() {

    val e = Scanner(System.`in`)
    println("Digite um número")
    val n1 = e.nextInt()
    println("Digite outro número")
    val n2 = e.nextInt()
    println(soma(n1, n2))

}