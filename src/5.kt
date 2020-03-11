import java.text.Format
import java.util.*

fun main(){
    val teclado = Scanner(System.`in`);

    print("Digite em metros: ");
    val m:Float = teclado.nextFloat();

    print("Centímetros: ${m*100}");

}