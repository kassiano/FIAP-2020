import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    print("Digite um número: \n");
    val numero = scanner.nextLine().toDouble();

    if (numero > 0) {
        print("Seu número é positivo!");
    } else if (numero < 0) {
        print("Seu número é negativo!");
    } else {
        print("Seu número é zero!");
    }
}