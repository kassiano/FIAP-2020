import java.util.*

fun areaCirculo(n:Double):Double{
    return Math.PI*Math.pow(n,2.0)
}

fun main(){
    val e = Scanner(System.`in`)
    println("Digite o raio do círculo")
    val r = e.nextDouble()
    println("A area do circulo é ${areaCirculo(r)}")
}