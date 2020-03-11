import java.text.Format
import java.util.*

fun main(){
    val teclado = Scanner(System.`in`);

    print("Ganho por hora: ");
    val hora:Double = teclado.nextDouble();

    print("Dias trabalhados: ");
    val dias:Int = teclado.nextInt();

    print("Salário do mês: ${dias*(hora*8)}");
}