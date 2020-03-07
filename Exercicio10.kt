import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);
    val grausCelsius = input.nextDouble();
    val grausFarenheit = (9/5 * grausCelsius + 32);
    println(grausFarenheit);
}