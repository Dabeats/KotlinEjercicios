fun main() {
    println("Ingrese el valor de la compra: ")
    var valorCompra = readLine()!!.toDouble()

    println("Valor compra: $valorCompra")

    var descuento = 0.0

    if (valorCompra >= 100000){
        descuento = valorCompra * 0.5
        valorCompra -= descuento
        println("Se aplico un descuento del 50% eqivalente a: $descuento")

    }

println("Valor final: $valorCompra")

}