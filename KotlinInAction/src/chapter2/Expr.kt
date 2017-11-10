package chapter2

import java.util.*

/**
 * Created by kws on 2017. 11. 9..
 */
interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun evaluate(e: Expr): Int {

    if (e is Num) {
        val n = e as Num
        return e.value
    }

    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                left + right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main(args: Array<String>) {
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))

    for (i in 1..100) {
        print(fizzBuzz(i))
    }

    println()

    for (i in 100 downTo 1){
        print(fizzBuzz(i))
    }
}
