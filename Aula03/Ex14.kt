import java.util.*

fun letra(c: Char): String {
    var tipo: String
    if (c.equals('a', true) or c.equals('e', true) or c.equals('i', true) or
        c.equals('o', true) or c.equals('u', true)
    ) {
        tipo = "Vogal"
    } else {
        tipo = "Consoante"
    }
    return tipo
}

fun main() {
    println("Digite uma letra para verificar se é consoante ou vogal")
    val e = Scanner(System.`in`)
    val c = e.nextLine().single()

    println("${letra(c)}")

}