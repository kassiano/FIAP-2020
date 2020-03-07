import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);
    val quantidadeNotas = 4;

    var somaNotas = 0.0;

    for(i in 0 until quantidadeNotas){
        println("Digite a nota ${i+1}:");
        val nota = input.nextDouble();
        somaNotas += nota
    }

    val media = somaNotas / quantidadeNotas;
    println(media);



}