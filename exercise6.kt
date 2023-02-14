fun main() {
    var menu ="""
    MENU DE OPCIONES
    1.Saludar
    2.Pedir nombre
    3.Sumar dos numeros
    Ingrese una opcion: """

    print(menu)

    var opcion = readLine()?.toInt()
    when (opcion) {
        1 -> println("Hola!")
        2 -> {
            print("Ingrese el nombre de una persona: ")
            val name = readLine()
            println("Hola. $name")
        }
        3 ->{
            print("Ingreesa el primer numero: ")
            val num1 =readLine()?.toInt()
            print("Ingreesa el segundo numero: ")
            val num2 =readLine()?.toInt()
            var result = num1!!+num2!!
            println("La suma de $num1 y $num2 es $result")
        }
        else -> println("Opcion no valida")
    }
}