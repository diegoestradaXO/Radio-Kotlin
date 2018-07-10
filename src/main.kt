//Diego Francisco Estrada Moreira
//Carnet 18540
//Fecha de creacion 08.07.2018
//Tarea de Radio con Kotlin
package main

import main.utils.Radio
//Se importan las clases del archivo utils
fun main(args: Array<String>){
    println("Bienvenido a la Radio")
    val myRad = Radio()//Variable que contiene la clase, a la cual se referira en el futuro
    do {//Ciclo principal del programa
        if (myRad.isTurnedOn == false){//En caso de estar apagada la radio
            println("Que desea hacer?:\n1.Encender\n2.Salir")
            val eleccion = readLine()!!
            if(eleccion == "1"){//Se enciende la radio
                myRad.turnOn()
            } else if (eleccion == "2"){
                println("Saliendo de radio...")//Se sale del menu y corta el ciclo
                break
            }
        } else if (myRad.isTurnedOn == true) {//si la radio esta encendida
            println("")
            println("""
            Que desea hacer?
            1.Apagar
            2.Subir volumen
            3.Bajar volumen
            4.Cambiar de modulacion
            5.Subir estacion
            6.Bajar estacion
            7.Ver estado de la radio
            """.trimIndent())
            val eleccion1 = readLine()!!
            if (eleccion1 == "1") {//si decide apagar la radio
                myRad.turnOff()
            } else if (eleccion1 == "2") {//si decide subir volumen
                if (myRad.volumen < 100){//verifica que el volumen sea menor que 100
                    println("Subiendo volumen...")
                    myRad.volumeUp()//sube volumen
                } else {//en caso contrario se notifica lo siguiente
                    println("No se puede subir mas volumen...")
                }
            } else if (eleccion1 == "3") {//si decide bajar el volumen
                if (myRad.volumen > 0){//verifica que el volumen sea mayor que 0
                    println("Bajando volumen...")
                    myRad.volumeDown()//baja el volumen
                } else {//si no cumple, se muestra el siguiente mensaje
                    println("No se puede bajar mas el volumen...")
                }
            } else if (eleccion1 == "4") {//si decide cambiar de modulacion
                println("Cambiando de modulacion...")
                if (myRad.modulacion == "AM") {
                    myRad.modulacion = "FM"//cambia la modulacion
                    myRad.estacion = 87//se traslada a la estacion 87
                } else if (myRad.modulacion == "FM") {
                    myRad.modulacion = "AM"//cambia a AM
                    myRad.estacion = 1000//se traslada a la estacion 1000
                }
            } else if (eleccion1 == "5") {//si decide subir estaciones
                println("Cuantas estaciones desea subir?")
                val step = readLine()!!.toInt()
                if (myRad.modulacion == "AM") {
                    if ((myRad.estacion + step) <= 1400) {//verifica que este en el rango
                        println("Subiendo estacion...")
                        myRad.estacion += step//se suman las estaciones a la actual
                    } else if ((myRad.estacion + step) > 1400) {
                        println("No es posible subir a esa estacion...")
                    }
                } else if (myRad.modulacion == "FM") {
                    if ((myRad.estacion + step) <= 147) {//verifica que este en el rango
                        println("Subiendo estacion...")
                        myRad.estacion += step//se suman las estaciones a la actual
                    } else if ((myRad.estacion + step) > 147) {
                        println("No es posible subir a esa estacion...")
                    }
                }
            } else if (eleccion1 == "6"){//si desea bajar de estacion
                println("Cuantas estaciones desea bajar?")
                val step = readLine()!!.toInt()
                if (myRad.modulacion == "AM"){
                    if ((myRad.estacion - step) >= 1000){//verifica que este en el rango
                        println("Bajando de estacion...")
                        myRad.estacion -= step//resta las estaciones a la actual
                    } else if ((myRad.estacion - step) < 1000){
                        println("No es posible bajar a esa estacion...")
                    }
                } else if (myRad.modulacion == "FM"){
                    if ((myRad.estacion - step) >= 87){//verifica que este en el rango
                        println("Bajando de estacion...")
                        myRad.estacion -= step//resta las estaciones a la actual
                    } else if ((myRad.estacion - step) < 87){
                        println("No es posible bajar a esa estacion...")
                    }
                }
            } else if (eleccion1 == "7"){//MOSTRAR EL ESTADO ACTUAL DE LA RADIO
                println(myRad.toString())
            }
        }
    } while (true)
}