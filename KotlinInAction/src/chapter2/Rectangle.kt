package chapter2

import java.util.*

/**
 * Created by kws on 2017. 11. 8..
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {     // 프로퍼티 게터 선언
            return height == width
        }
}

fun createRandomRectangle() : Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}