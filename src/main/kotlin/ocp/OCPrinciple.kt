package ocp

fun main() {
    val dog = Dog()
    dog.move()
    dog.woof()
}

open class Animal {
    fun move() {
        println("moving!!")
    }
}

class Dog : Animal() {
    fun woof() {
        println("woof!!")
    }
}