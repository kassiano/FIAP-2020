import java.util.*

fun main() {
    val lista = mutableListOf<Int>()
    val e = Scanner(System.`in`)
    for(i in 1 until 5){
        println("Digite o $i"+"ª nota:")
        var n = e.nextInt()
        lista.add(n)
    }
    println("Média: ${lista.average()}")
}