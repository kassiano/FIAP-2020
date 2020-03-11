import java.util.*

fun soma(n1:Int, n2:Int): Int = n1+n2;

fun main(){
    val teclado = Scanner(System.`in`);

    print("Entre com o 1º número: ");
    val n1 = teclado.nextInt();
    print("Entre com o 2º número: ");
    val n2 = teclado.nextInt();

    print("Resultado da soma: ${soma(n1,n2)}");
}