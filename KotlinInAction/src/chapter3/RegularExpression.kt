package chapter3

/**
 * Created by kws on 2017. 11. 17..
 */
fun main(args: Array<String>) {
    println("12.345-6.A".split("\\.".toRegex()))
    println("12.345-6.A".split(".", "-"))

    val path = "/Users/yole/kotlin-book/chapter.adoc"
    parsePath(path)
    parsePath2(path)

    val kotlinLogo = """| //
                       .| //
                       .|/ \"""

    println(kotlinLogo.trimMargin("."))

}

fun parsePath(path: String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir : $directory, name: $fileName, ext: $extension")
}

fun parsePath2(path: String){
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null){
        val (directory, filename, extension) = matchResult.destructured
        println("Dir : $directory, name: $filename, ext: $extension")
    }
}