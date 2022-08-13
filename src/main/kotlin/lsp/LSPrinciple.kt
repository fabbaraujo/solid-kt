package lsp

fun main() {
    val vehicles: List<Vehicle> = VechicleRepository().getAll()
    for (vehicle in vehicles) {
        println(vehicle.registration)
    }
}

open class Vehicle(val registration: String)

data class Car(val reg: String) : Vehicle(reg)

data class Campervan(val reg: String, val numberOfBeds: Int) : Vehicle(reg)

class VechicleRepository {
    fun getAll(): List<Vehicle> {
        val vehicles: MutableList<Vehicle> = ArrayList()
        vehicles.add(Car(reg = "ABC"))
        vehicles.add(Campervan(reg = "DEF", numberOfBeds = 2))
        return vehicles
    }
}