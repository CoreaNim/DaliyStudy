package chapter3

/**
 * Created by kws on 2017. 11. 13..
 */
fun String.lastChar(): Char = this.get(this.length - 1)

fun main(args: Array<String>) {

    println("Kotlin".lastChar())

}

