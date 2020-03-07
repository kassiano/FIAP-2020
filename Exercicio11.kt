import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);
    val num1 = input.nextDouble();
    val num2 = input.nextDouble();
    val maior = num1 isGreaterThan num2;
    println(maior);
}

infix fun Double.isGreaterThan(num : Double): Boolean = this > num;