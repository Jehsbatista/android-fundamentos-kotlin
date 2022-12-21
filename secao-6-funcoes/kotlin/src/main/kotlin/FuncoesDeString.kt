fun main() {
    var str = "Programação Kotlin"

    println("O tamanho da string é ${str.length}")   //length acessa o tamanho da string
    println("A posição (index) que eu desejo é a posição 4, que é a letra ${str[4]}")   //utilizando [] eu acesso o index que desejo, a posição

    //Algumas funções já disponíveis na biblioteca Kotlin

    println(str.startsWith("pro"))
    println(str.endsWith("Kotlin"))
    println(str.substring(2, 5))
    println(str.replace("Kotlin", "Kotlin show"))
    println(str.uppercase())
    println(str.lowercase())
    println("        jéssica     ".trim())

}

