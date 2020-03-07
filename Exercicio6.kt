import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);
    val raio = input.nextDouble();
    val area = 2 * Math.PI * raio;
    println(area);
}