import java.util.*

fun ToCelsius(F:Double):Double = (5 * (F-32) / 9);

fun main(){
    val teclado = Scanner(System.`in`);

    print("Fahreight: ");
    val F:Double = teclado.nextDouble();

    print("Celsius: ${ToCelsius(F)}");
}