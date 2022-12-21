fun main() {
    converteAnos(2)
    println(caracter("abcdefghijklmn"))
    println(cubo(3))
    println(milhas(100f))
    x("gfdafASASKHAHGADasasasagjhABGTAA")
}


// função que converta anos em meses, dias, horas, minutos e segundos.
fun converteAnos(anos: Int) {
    println("${anos} anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")

}


// função que recebe uma string e retorna a quantidade de caracteres
fun caracter(str: String) = str.length


// função que retor o cubo
fun cubo(n: Int) = n * n * n


// função que recebe milhas e converte em km
fun milhas(milhas: Float): Float = milhas * 1.6f


// função que substitui A por x e se estiver maiúscula fica minúscula
fun x(str: String) {
    println(str.lowercase().replace("a", "x"))
}