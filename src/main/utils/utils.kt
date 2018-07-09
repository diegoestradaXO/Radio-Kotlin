package main.utils
class Radio (
        var modulacion: String = "AM",
        var volumen: Int = 0,
        var estacion: Int = 87,
        var isTurnedOn: Boolean = false
) {
    fun turnOn() {
        isTurnedOn = true
    }

    fun turnOff() {
        isTurnedOn = false
    }

    fun volumeUp() {
        volumen += 1
    }

    fun volumeDown() {
        volumen -= 1
    }

    fun estacionArriba(step: Int) {
        estacion += step
    }

    fun estacionAbajo(step: Int) {
        estacion -= step
    }

    fun cambiarMod(mod: String) {
        modulacion = mod
    }
    override fun toString(): String {
        return """
            Radio:
                Modulacion: $modulacion
                Esta encendido: $isTurnedOn
                Volumen: $volumen
                Estacion: $estacion
        """.trimIndent()
    }
}
