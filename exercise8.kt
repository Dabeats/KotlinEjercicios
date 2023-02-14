fun main() {
    var resp = "si"
    var cont = 0

    while (resp == "si") {
        print("\n Ingrese su nombre: ")
        val nombre = readLine()!!

        println("Hola $nombre bienvenido a la clase!\n")
        cont++
        print("Ingrese si, si hay mas personas: ")
        resp =readLine()!!
    }

    println("Llegaron $cont personas!")
    println("Fin del ciclo")
}