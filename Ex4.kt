import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    var somaDasNotas = 0;
    var indice = 0;

    for (i in 1..4) {
        print("Digite a nota número ${i}");
        somaDasNotas += Integer.parseInt(scanner.nextLine());
        indice++;
    }

    print("A média é: ${somaDasNotas / 4.0}");

    scanner.close();
}