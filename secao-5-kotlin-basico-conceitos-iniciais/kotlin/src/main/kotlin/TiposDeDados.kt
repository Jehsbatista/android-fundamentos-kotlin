/*
Type      Bit

Double    64           armazenas valores numericos, inteiros e flutuantes Ex: 1,5
Float     32           armazenas valores numericos, inteiros e flutuantes Ex: 1,5
Long      64           armazenas valores numericos, inteiros.
Int       32           armazenas valores numericos, inteiros.
Short     16           armazenas valores numericos, inteiros.
Byte      8            armazenas valores numericos, inteiros.
Boolean   true/false
String    " "          quantos caracteres quiser, irá ocupar o tamanho necessário
Char      ' '          somente um caracter
*/


fun main() {

    var a: Char = 'J'
    var b: String = "Jéssica Jéssica Jéssica Jéssica Jéssica "
    var c: Boolean = true


    var double: Double = 10.0
    var float: Float = 10F
    var long: Long = 10
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10


    println("Double MAX ${Double.MAX_VALUE}  -  ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE}  -  ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE}  -  ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE}  -  ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE}  -  ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE}  -  ${Byte.MIN_VALUE}")

}