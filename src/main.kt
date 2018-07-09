package main

import main.utils.Radio

fun main(args: Array<String>){
    println("Bienvenido a la Radio")
    val myRadio = Radio(modulacion = "FM", volumen = 0, estacion = 87 )
    println(myRadio)
    var menu = true
    do {
        println("Que desea cambiar?\n1.Encender/Apagar\n2.Cambiar Modulacion\n3.Subir volumen\n4.Bajar volumen\n5.Subir de estacion\n6.Bajar de estacion:")
        val decision: String = readLine()
        if (decision == 1){
            if (myRadio.isTurnedOn == true){
                myRadio.turnOff()
            } else {myRadio.turnOn()}}
        else if (decision == 2){
            if (myRadio.modulacion == "AM"){
                myRadio.cambiarMod()
            }
        }
    }



}