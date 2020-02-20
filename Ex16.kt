import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);

    val perguntas = arrayOf(
        "Telefonou para a vítima?\n",
        "Esteve no local do crime?\n",
        "Mora perto da vítima?\n",
        "Devia para a vítima?\n",
        "Já trabalhou com a vítima?\n"
    );

    var respostasPositivas = 0;

    print("Digite S para sim, N para não.\n");
    for (i in 0..4) {
        print(perguntas[i]);

        val resposta = scanner.nextLine();

        if (resposta == "s" || resposta == "S") {
            respostasPositivas++;
        }
    }

    if (respostasPositivas < 2) {
        print("Inocente.");
    } else if (respostasPositivas == 2) {
        print("Suspeita.");
    } else if (respostasPositivas == 3 || respostasPositivas == 4) {
        print("Cúmplice.");
    } else {
        print("Assassino.");
    }
}