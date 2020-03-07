import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);
    val letra = input.nextLine();
    when(letra){
        "F" -> {
            println("F - Feminino");
        }
        "M" -> {
            println("M - Masculino");
        }
        else -> {
            println("Sexo Inválido");
        }

    }
}