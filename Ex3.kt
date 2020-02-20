import java.util.Scanner;

fun main (args: Array<String>) {
    val scanner = Scanner(System.`in`);

    print("Digite o primeiro número:");
    val n1 = Integer.parseInt(scanner.nextLine());
    print("Digite o segundo número:");
    val n2 = Integer.parseInt(scanner.nextLine());

    print("A soma é: ${n1 + n2}");

    scanner.close();
}