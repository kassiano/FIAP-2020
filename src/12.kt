import java.util.*

fun main(){
    val teclado = Scanner(System.`in`);

    print("Digite um número inteiro: ");
    val n:Float = teclado.nextFloat();

    if (n>=0) print("É positivo");
    else print("É negativo");
}