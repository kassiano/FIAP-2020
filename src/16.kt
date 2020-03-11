import java.util.*

fun main(){
    val teclado = Scanner(System.`in`);

    print("Telefonou para a vítima [S/N]? ");
    val Q1:Char = teclado.next().toChar();

    print("Esteve no local do crime [S/N]? ");
    val Q2:Char = teclado.next().toChar();

    print("Mora perto da vítima [S/N]? ");
    val Q3:Char = teclado.next().toChar();

    print("Devia para a vítima [S/N]? ");
    val Q4:Char = teclado.next().toChar();

    print("Já trabalhou com a vítima [S/N]? ");
    val Q5:Char = teclado.next().toChar();

    val respostas = listOf<Char>(Q1, Q2, Q3, Q4, Q5)

    print("Classificação para o crime é ${classificacao(respostas)}");
}

fun classificacao(respostas: List<Char>): String {
    var count:Int = 0;

    respostas.map {
        if(it.toLowerCase().equals('s')) count++;
    }

    if (count == 2) return "suspeito(a)";
    else if (count >=3 && count <=4)  return "cúmplice";
    else if (count > 4)  return "assassino";
    else return "inocente";
}
