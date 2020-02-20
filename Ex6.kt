import java.util.Scanner;

fun main (args: Array<String>) {
    val scanner = Scanner(System.`in`);
    print("Digite o raio do círculo");
    val raio = Integer.parseInt(scanner.nextLine());
    val area = raio * raio * Math.PI;
    print("A área do círculo é: ${area}");

    scanner.close();
}