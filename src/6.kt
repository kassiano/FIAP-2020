import java.text.Format
import java.util.*

fun main(){
    val teclado = Scanner(System.`in`);

    print("Digite o raio de um círculo: ");
    val r:Double = teclado.nextDouble();

    print("Área do círculo: ${Math.PI*Math.pow(r,2.0)}");

}