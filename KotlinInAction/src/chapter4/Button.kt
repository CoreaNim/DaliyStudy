package chapter4

/**
 * Created by kws on 2017. 11. 20..
 */
class Button : Clickable{

    override fun click() = println("I was clicked")

}

fun main(args: Array<String>) {
    Button().click()
}