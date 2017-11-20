package chapter3

/**
 * Created by kws on 2017. 11. 14..
 */
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {

    println("Kotlin".lastChar())

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

    val strings: List<String> = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers: Collection<Int> = setOf(1, 14, 2)
    println(numbers.max())

    val list = listOf("args: ", *args)
    println("list args = " + list)

    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    val (number, name) = 1 to "one"

    println("2.to = " + 2.to("one"))
    println("3 to = " + 3 to "one")

    infix fun Any.to(other: Any) = Pair(this, other)

    for ((index, element) in list.withIndex()){
        println("$index: $element")
    }
}