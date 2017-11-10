package chapter2

/**
 * Created by kws on 2017. 11. 3..
 */
fun main(args: Array<String>){
    println("Hello, world")
    println(max(1,3))

    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")    // 문자열 템플릿(string template)

    if (args.size > 0)
        println("Hello, ${args[0]}!")

    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")


    val person = Person("Bob", true);
    println(person.name)
    println(person.isMarried)
}

/*
문(statement)과 식(expression)의 구분
자바에서는 모든 제어 구조가 문인 반면 코틀린에서는 루프를 제외한 대부분의 제어 구조가 식이다.
*/
fun max(a: Int, b: Int) : Int {
    return if (a>b) a else b
}

/*
본문이 중괄호로 둘러싸인 함수 -> 블록이 본문인 함수
본문이 등호와 식으로 이뤄진 함수 -> 식이 본문인 함수
식이 본문인 함수는 타입 추론에 의해 함수의 반환 타입 생략 가능
*/
fun min(a: Int, b: Int) = if (a>b) b else a

/*
컴파일러는 변수 선언 시점의 초기화 식으로부터 변수의 타입을 추론.
변수 선언 이후 변수 재대입이 이뤄질 때는 이미 추론한 변수의 타입을 사용.
다른 타입으로 값을  저장하고 싶다면 형변환 필요.
*/
val question = "삶 우주 그리고 모든 것에 대한 궁극적인 질문"
val year: Int = 12
val month = 10
var day = 5

// val = value 불변, var = variable 변수
fun counting(){
    day = 3
//    question = 5   // ERROR! The integer literal does not conform to the expected type String
//    month = 3     // ERROR! Val cannot be reassigned
    // val 참조 자체는 불변일지라도 그 참조가 가리키는 객체의 내부 값은 변경 가능
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
}

class Person(
    val name: String,       // 읽기 전용 프로퍼티
    var isMarried: Boolean  // 쓸 수 있는 프로퍼티
)


