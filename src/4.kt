import java.text.Format
import java.util.*

fun main(){
    val teclado = Scanner(System.`in`);
    val lista = mutableListOf<Float>();

    for(i in 0 until 4){
        print("Entre com a ${i+1}º nota: ");
        lista.add(teclado.nextFloat());
    }

    var soma:Float = 0F;
    lista.map {
        soma += it;
    }

    print("Média das notas: ${soma/4}");
}