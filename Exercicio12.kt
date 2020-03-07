import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);
    val num = input.nextDouble();
    var classificacao = "";
    if(num > 0) classificacao = "positivo";
    else if (num < 0) classificacao = "negativo";
    else classificacao =  "neutro";
    println("O número é: $classificacao");
}