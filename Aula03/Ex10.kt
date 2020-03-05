import java.util.*
import kotlin.math.roundToInt
import kotlin.math.roundToLong

fun calculaC(c: Double): Double {
    return (9 * c / 5) + 32 // (9 * c / 5) + 32
}


fun main() {
    val e = Scanner(System.`in`)
    println("Digite a temperatura em ºC:")
    val temp = e.nextDouble()
    println("${calculaC(temp).roundToInt()}" + " ºF")
}
