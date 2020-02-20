import java.util.Scanner;

fun main(args: Array<String>) {
    val scanner: Scanner = Scanner(System.`in`);
    val temperaturaEmCelsius: Double = coletarTemperaturaEmCelsius(scanner);
    val temperaturaEmFarenheit: Double = temperaturaEmCelsius * 1.8 + 32;
    print("A temperatura em Farenheit é ${temperaturaEmFarenheit}");
}

fun coletarTemperaturaEmCelsius(scanner: Scanner): Double {
    print("Digite a temperatura em Celsius:\n");
    return scanner.nextLine().toDouble();
}