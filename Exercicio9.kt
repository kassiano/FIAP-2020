import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);
    val grausFarenheit = input.nextDouble();
    val grausCelsius = (5 * (grausFarenheit-32) / 9);
    println(grausCelsius);
}