package main

import main.utils.Radio

fun main(args: Array<String>){
    println("Bienvenido a la Radio")
    val myRadio = Radio(modulacion = "FM", volumen = 0, estacion = 87 )
    println(myRadio)

}