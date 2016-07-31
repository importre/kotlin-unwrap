private fun foo(name: String?): String? = name

private fun bar() {
    val _a = foo("Hello")
    val _b = foo("World")
    val _c = foo("!")

    // example: unwrap all variables
    unwrap(_a, _b, _c) { a, b, c ->
        println("$a, $b$c")
    }
}

private fun baz() {
    val _a = foo("Hello")
    val _b = foo("World")
    val _c = foo(null)

    // example: error handing
    unwrap(_a, _b, _c) { a, b, c ->
        println("$a, $b$c")
    } nah {
        println("Nah!")
    }
}

fun main(args: Array<String>) {
    bar() // Hello World!
    baz() // Nah!
}
