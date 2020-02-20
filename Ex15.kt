import java.util.Scanner;

fun main(args: Array<String>) {
    val numero = receberNumero();

    if (numero % 2 != 0) {
        print("É um número ímpar!")
    } else {
        print("É um número par!");
    }
}

fun receberNumero(): Int {
    val scanner = Scanner(System.`in`);

    print("Digite um número inteiro: ");

    val numero = Integer.parseInt(scanner.nextLine());

    scanner.close();

    return numero;
}