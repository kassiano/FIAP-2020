import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);
    val lado = input.nextDouble();
    val resultado = areaQuadrado(lado) * 2;
    println(resultado);
}

fun areaQuadrado(lado: Double): Double = lado * lado;