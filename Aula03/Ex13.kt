import java.util.*

fun sexoTipo(n: Char) {
    if (n.equals('f',true)) {
        println("Feminino")
    } else if (n.equals('m',true)){
        println("Masculino")
    } else{
        println("Sexo Inválido")
    }
}

fun main() {
    val e = Scanner(System.`in`)
    println("Digite F ou M")
    val sexo :Char = e.nextLine().single()
    sexoTipo(sexo)

}