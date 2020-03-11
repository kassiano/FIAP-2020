import java.text.Format
import java.util.*

fun main(){
    val teclado = Scanner(System.`in`);

    print("Digite a medida do lado do quadrado: ");
    val L:Double = teclado.nextDouble()

    val area:Double = Math.pow(L, 2.0);

    print("Área do quadrado: ${area} \n");
    print("Dobro da área do quadrado: ${area*2}")

}