import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`);

    val num = input.nextInt();
    if(num.isOdd()) println("O número é Par");
    else println("O número é Impar");
}

fun Int.isOdd(): Boolean = this % 2 == 0;