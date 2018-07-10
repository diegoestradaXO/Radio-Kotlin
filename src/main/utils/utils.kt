//Diego Francisco Estrada Moreira
//Carnet 18540
//Fecha de creacion 08.07.2018
//Tarea de Radio con Kotlin
package main.utils
class Radio (//Clase de la Radio
        var modulacion: String = "FM",
        var volumen: Int = 0,
        var estacion: Int = 87,
        var isTurnedOn: Boolean = false
) {
    fun turnOn() {//ENCIENDE LA RADIO
        isTurnedOn = true
    }

    fun turnOff() {//APAGA LA RADIO
        isTurnedOn = false
    }

    fun volumeUp() {//SUBE VOLUMEN
        volumen += 1
    }

    fun volumeDown() {//BAJA VOLUMEN
        volumen -= 1
    }
    override fun toString(): String {//IMPRIME EL ESTADO DE LA RADIO
        return """
            -------------------------------
            Radio:
                Modulacion: $modulacion
                Esta encendido: $isTurnedOn
                Volumen: $volumen
                Estacion: $estacion
             -------------------------------
        """.trimIndent()
    }
}
