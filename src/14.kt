import java.util.*

fun CharSequence.toChar() = single()

fun main(){
    val teclado = Scanner(System.`in`);

    print("Digite uma letra: ");
    val letra:Char = teclado.next().toChar();

    if (letra.isLetter()){
        print("O caracter é ${checarLetra(letra)}");
    }
    else print("Caracter inválido");
}

fun checarLetra(letra: Char): String {
    val vogais = listOf<Char>('a', 'e', 'i', 'o', 'u');

    for(i in 0 until vogais.count()){
        if(letra.toChar().toLowerCase().equals(vogais[i])) return "vogal";
    }
    return "consoante";
}
