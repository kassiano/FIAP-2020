import java.util.Scanner;

fun main (args: Array<String>) {
    val scanner = Scanner(System.`in`);
    print("Digite o seu número de horas trabalhadas:\n");
    val horas: Double = scanner.nextLine().toDouble();
    print("Digite quanto você ganha por hora:\n");
    val valorPorHora: Double = scanner.nextLine().toDouble();

    print("O seu salário no referido mês é: R$${horas * valorPorHora}");

    scanner.close();
}