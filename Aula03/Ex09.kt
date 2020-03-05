import java.util.*
import kotlin.math.roundToInt

fun calculaTemp (f:Double):Double{
    return (5 * (f-32) / 9)  // (5 * (F-32) / 9)
}


fun main(){
    val e = Scanner(System.`in`)
    println("Digite a temperatura em ºF:")
    val temp = e.nextDouble()
    println("${calculaTemp(temp).roundToInt()}"+" ºC")
}
