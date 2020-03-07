import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);
    val letra = input.next();
    val vogais = listOf("a","e","i","o","u");
    if(vogais.contains(letra.toLowerCase())){
        println("É vogal");
    }else{
        println("É consoante");
    }
}