import java.util.*

fun main(){
    val teclado = Scanner(System.`in`);

    print("Digite M ou F: ");
    val letra:String = teclado.next();

    if (letra.toLowerCase().equals("m")) print("Masculino");
    else if (letra.toLowerCase().equals("f")) print("Feminino");
    else print("Sexo inválido");
}