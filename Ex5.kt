import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    print("Digite a quantidade em metros:\n");
    val metros = Integer.parseInt(scanner.nextLine());
    print("A quantidade de centímetros é: ${metros * 100} cm.");

    scanner.close();
}