import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    print("Digite um número: \n");
    val n1 = scanner.nextLine().toDouble();
    print("Digite outro número: \n");
    val n2 = scanner.nextLine().toDouble();

    if (n1 > n2) {
        print("O maior dos números era ${n1}");
    } else {
        print("O maior dos números era ${n2}");
    }
}