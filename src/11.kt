import java.util.*

fun main(){
    val teclado = Scanner(System.`in`);

    print("Digite o 1º número: ");
    val n1:Int = teclado.nextInt();

    print("Digite o 2º número: ");
    val n2:Int = teclado.nextInt();

    if (n1>n2) print("N1 é maior que N2");
    else if(n2>n1) print("N2 é maior que N1");
    else print("Números são iguais");

}