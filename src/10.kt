import java.util.*

fun ToFarenheit(C:Double):Double = C*(9/5)+32;

fun main(){
    val teclado = Scanner(System.`in`);

    print("Celsius: ");
    val C:Double = teclado.nextDouble();

    print("Farenheit: ${ToFarenheit(C)}");

}