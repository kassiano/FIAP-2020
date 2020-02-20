import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    print("Digite um gênero: [F/M]\n");
    val genero = scanner.nextLine();

    if (genero.equals("F")) {
        print("Feminino");
    } else if (genero.equals("M")) {
        print("Masculino");
    } else {
        print("Sexo inválido");
    }
}