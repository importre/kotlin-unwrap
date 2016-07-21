// returns nullable
fun foo(name: String?): String? = name

fun bar(): String {
    val _a = foo("Hello")
    val _b = foo("World")
    val _c = foo("!")

    // unwrap all variables
    return unwrap(_a, _b, _c) { a, b, c ->
        "$a $b$c"
    } ?: return ""
}

fun baz(): String {
    val _a = foo("Hello")
    val _b = foo("World")
    val _c = foo(null)

    // unwrap all variables
    return unwrap(_a, _b, _c) { a, b, c ->
        "$a $b$c"
    } ?: return ""
}

fun main(args: Array<String>) {
    println(bar())       // "Hello World!"
    println(baz() == "") // true
}
