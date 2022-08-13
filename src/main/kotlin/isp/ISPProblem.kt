package isp

import kotlin.math.pow

interface BadShape {
    fun radius(): Double
    fun area(): Double
}

data class BadCircle(val diameter: Double): BadShape {
    override fun radius(): Double {
        return diameter / 2
    }

    override fun area(): Double {
        return Math.PI * radius().pow(2)
    }
}

data class BadSquare(val width: Double, val height: Double): BadShape{
    override fun radius(): Double {
        return 0.0
    }

    override fun area(): Double {
        return width * height
    }

}