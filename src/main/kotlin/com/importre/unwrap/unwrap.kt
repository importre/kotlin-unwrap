package com.importre.unwrap

class Unwrap {

    var valid: Boolean = false

    infix fun <R> nah(f: Unwrap.() -> R) {
        if (!valid) f()
    }
}
