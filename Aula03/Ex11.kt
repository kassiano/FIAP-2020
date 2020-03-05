import java.util.*

fun main(){
    val lista = mutableListOf<Int>()
    val e = Scanner(System.`in`)

    for(i in 1 until 3){
        println("Digite o $i"+"º número")
        val n = e.nextInt()
        lista.add(n)
    }

    println("Maior Número: ${lista.max()}")
}
