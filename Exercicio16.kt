import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);
    val perguntas = listOf( "Telefonou para a vítima?",
                            "Esteve no local do crime?",
                            "Mora perto da vítima?",
                            "Devia para a vítima",
                            "Já trabalhou com a vítima");
    var respostasSim = 0;
    for(pergunta in perguntas){
        println("$pergunta (S/N)");
        val resposta = input.next();
        if(resposta.toUpperCase() == "S"){
            respostasSim++;
        }
    }

    when(respostasSim){
        2 -> {
            println("Suspeita");
        }
        3,4 -> {
            println("Cúmplice");
        }
        5 -> {
            println("Assassino");
        }
        else -> {
            println("Inocente");
        }
    }
}