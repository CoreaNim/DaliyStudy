package chapter2

/**
 * Kotlin 에서 enum은 소프트 키워드(soft keyword)라 부름
 */
enum class Color(
        val r: Int, val g: Int, val b: Int  // 상수의 프로퍼티 정의
) {
    RED(255, 0, 0), ORANGE(255, 165, 0),    // 각 상수를 생성할 때 그에 대한 프로퍼티 값 지정
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b     // enum 클래스 안에서 메소드 정의
}

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }

fun main(args: Array<String>) {
    println(getMnemonic(Color.BLUE))
    println(mix(Color.BLUE, Color.GREEN))
}

// when의 분기 조건에 여러 다른 객체 사용하기
fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.BLUE) -> Color.ORANGE
            else -> throw Exception("Dirty Color")
        }

// 인자 없는 when 사용
fun mixOptimized(c1: Color, c2: Color) =
        when {
            (c1 == Color.RED && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED)
                -> Color.ORANGE
            else -> Color.GREEN
        }






