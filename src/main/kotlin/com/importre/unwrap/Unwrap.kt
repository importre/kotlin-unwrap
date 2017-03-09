package com.importre.unwrap

class Unwrap(private var valid: Boolean) {
    infix fun <R> nah(f: () -> R) {
        if (!valid) f()
    }
}

inline fun <T1, R> unwrap(
        t1: T1?,
        block: (T1) -> R): Unwrap {
    val valid = null !in arrayOf<Any?>(t1)
    if (valid) block(t1!!)
    return Unwrap(valid = valid)
}

inline fun <T1, T2, R> unwrap(
        t1: T1?, t2: T2?,
        block: (T1, T2) -> R): Unwrap {
    val valid = null !in arrayOf(t1, t2)
    if (valid) block(t1!!, t2!!)
    return Unwrap(valid = valid)
}

inline fun <T1, T2, T3, R> unwrap(
        t1: T1?, t2: T2?, t3: T3?,
        block: (T1, T2, T3) -> R): Unwrap {
    val valid = null !in arrayOf(t1, t2, t3)
    if (valid) block(t1!!, t2!!, t3!!)
    return Unwrap(valid = valid)
}

inline fun <T1, T2, T3, T4, R> unwrap(
        t1: T1?, t2: T2?, t3: T3?, t4: T4?,
        block: (T1, T2, T3, T4) -> R): Unwrap {
    val valid = null !in arrayOf(t1, t2, t3, t4)
    if (valid) block(t1!!, t2!!, t3!!, t4!!)
    return Unwrap(valid = valid)
}

inline fun <T1, T2, T3, T4, T5, R> unwrap(
        t1: T1?, t2: T2?, t3: T3?, t4: T4?, t5: T5?,
        block: (T1, T2, T3, T4, T5) -> R): Unwrap {
    val valid = null !in arrayOf(t1, t2, t3, t4, t5)
    if (valid) block(t1!!, t2!!, t3!!, t4!!, t5!!)
    return Unwrap(valid = valid)
}
