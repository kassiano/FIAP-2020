import java.util.*

fun suspeitar(n: Int): Boolean {
    if (n == 1) {
        return true
    } else {
        return false
    }
}

fun sentenca(n: Int): String {
    var status: String
    if (n == 0) {
        status = "Inocente"
    } else if (n < 3) {
        status = "Suspeito"
    } else if (n < 5) {
        status = "Cumplice"
    } else {
        status = "Assassino"
    }
    return status
}

fun main() {
    val lista = mutableListOf<Boolean>()
    val e = Scanner(System.`in`)
    var resposta: Int

    println("Telefonou para a vítima?")
    println("1 - Sim | 2 - Não")
    resposta = e.nextInt()
    lista.add(suspeitar(resposta))

    println("Esteve no local do crime?")
    println("1 - Sim | 2 - Não")
    resposta = e.nextInt()
    lista.add(suspeitar(resposta))

    println("Mora perto da vítima?")
    println("1 - Sim | 2 - Não")
    resposta = e.nextInt()
    lista.add(suspeitar(resposta))

    println("Devia para a vítima?")
    println("1 - Sim | 2 - Não")
    resposta = e.nextInt()
    lista.add(suspeitar(resposta))

    println("Já trabalhou com a vítima?")
    println("1 - Sim | 2 - Não")
    resposta = e.nextInt()
    lista.add(suspeitar(resposta))

    val cont = lista.filter { it == true }.size
    println("${sentenca(cont)}")

    // =0 -- <3    <5    =5


}