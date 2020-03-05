import java.util.*

fun areaQuadrado(n:Double):Double{
    return n*n
}

fun main(){
    val e = Scanner(System.`in`)
    println("Digite o lado do quadrado")
    val n = e.nextDouble()
    println("A area do quadrado é ${areaQuadrado(n)}")
    println("O Dobro da área é ${areaQuadrado(n)*2}")
}