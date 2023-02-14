fun main() {
    val edad = readLine()!!.toInt()

    if(edad >= 18){
        println("La persona es mayor de edad")
        if(edad == 25){
            println("La persona tiene 25 años")
        }
    }else{
        println("La persona es menor de edad")
    }
}