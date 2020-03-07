import java.text.NumberFormat
import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`);
    val valorHora = input.nextDouble();
    val horasTrabalhadasMes = input.nextDouble();
    val salario = valorHora * horasTrabalhadasMes;
    val salarioFormatado = NumberFormat.getCurrencyInstance().format(salario);
    println("Salário no mês: $salario");
}