import java.util.*

fun main(){
    val teclado = Scanner(System.`in`);

    print("Digite um número inteiro: ");
    val n:Int = teclado.nextInt();

    if (n%2==0) print("Número é par");
    else print("Número é ímpar");
}

