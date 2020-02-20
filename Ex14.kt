import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);

    print("Digite uma letra:\n");
    val letra = scanner.nextLine();

    if (vogal(letra)) {
        print("É uma vogal!");
    } else {
        print("É uma consoante!");
    }
}

fun vogal(letra: String): Boolean {
    return letra == "a"
        || letra == "e"
        || letra == "i"
        || letra == "o"
        || letra == "u";
}