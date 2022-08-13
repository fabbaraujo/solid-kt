package isp

import kotlin.math.pow

interface Shape {
    fun area(): Double
}

interface CircularShape {
    fun radius(): Double
}

data class Circle(val diameter: Double): Shape, CircularShape {
    override fun area(): Double {
        return diameter / 2
    }

    override fun radius(): Double {
        return Math.PI * radius().pow(2)
    }
}

data class Square(val width: Double, val height: Double): Shape {
    override fun area(): Double {
        return width * height
    }
}