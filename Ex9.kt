import java.util.Scanner;

fun main (args : Array<String>) {
    val scanner : Scanner = Scanner(System.`in`);
    val temperaturaEmFarenheit : Double = coletarTemperaturaEmFarenheit(scanner);
    val temperaturaEmCelsius : Double = (temperaturaEmFarenheit - 32) * 5 / 9;
    print("A temperatura em Celsius é ${temperaturaEmCelsius}");
    scanner.close();
}

fun coletarTemperaturaEmFarenheit(scanner : Scanner) : Double {
    print("Digite a temperatura em Farenheit:\n");
    return scanner.nextLine().toDouble();
}