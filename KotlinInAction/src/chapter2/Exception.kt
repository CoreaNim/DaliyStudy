package chapter2

import java.io.BufferedReader
import java.io.StringReader

/**
 * Created by kws on 2017. 11. 10..
 */
fun main(args: Array<String>) {
    val number = 10
    val percentage =
            if (number in 0..100)
                println(number)
            else
                throw IllegalArgumentException("A percentage value must be between 0 and 100: $number")

    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}

fun readNumber(reader: BufferedReader) : Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e: NumberFormatException){
        return null
    }
    finally {
        reader.close()
    }
}

