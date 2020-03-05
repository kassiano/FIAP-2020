import java.text.NumberFormat
import java.util.*
fun Double.toCurrencyFormat():String{
    val f = NumberFormat.getCurrencyInstance()
    return f.format(this)
}
fun salario(valor:Double, horas:Int):Double{
    return valor*horas
}

fun main (){
val e = Scanner(System.`in`)
    println("Valor da Hora")
    val valor = e.nextDouble()
    println("Quantas horas")
    val horas = e.nextInt()
    println("Salário mensal: ${salario(valor,horas).toCurrencyFormat()}")
}