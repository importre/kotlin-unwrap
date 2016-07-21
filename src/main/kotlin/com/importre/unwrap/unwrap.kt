inline fun <T1, R> unwrap(
        t1: T1?,
        block: (T1) -> R): R? {
    return if (t1 != null) {
        block(t1)
    } else {
        null
    }
}

inline fun <T1, T2, R> unwrap(
        t1: T1?,
        t2: T2?,
        block: (T1, T2) -> R): R? {
    return if (t1 != null
            && t2 != null) {
        block(t1, t2)
    } else {
        null
    }
}

inline fun <T1, T2, T3, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        block: (T1, T2, T3) -> R): R? {
    return if (t1 != null
            && t2 != null
            && t3 != null) {
        block(t1, t2, t3)
    } else {
        null
    }
}

inline fun <T1, T2, T3, T4, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        t4: T4?,
        block: (T1, T2, T3, T4) -> R): R? {
    return if (t1 != null
            && t2 != null
            && t3 != null
            && t4 != null) {
        block(t1, t2, t3, t4)
    } else {
        null
    }
}

inline fun <T1, T2, T3, T4, T5, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        t4: T4?,
        t5: T5?,
        block: (T1, T2, T3, T4, T5) -> R): R? {
    return if (t1 != null
            && t2 != null
            && t3 != null
            && t4 != null
            && t5 != null) {
        block(t1, t2, t3, t4, t5)
    } else {
        null
    }
}

inline fun <T1, T2, T3, T4, T5, T6, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        t4: T4?,
        t5: T5?,
        t6: T6?,
        block: (T1, T2, T3, T4, T5, T6) -> R): R? {
    return if (t1 != null
            && t2 != null
            && t3 != null
            && t4 != null
            && t5 != null
            && t6 != null) {
        block(t1, t2, t3, t4, t5, t6)
    } else {
        null
    }
}

inline fun <T1, T2, T3, T4, T5, T6, T7, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        t4: T4?,
        t5: T5?,
        t6: T6?,
        t7: T7?,
        block: (T1, T2, T3, T4, T5, T6, T7) -> R): R? {
    return if (t1 != null
            && t2 != null
            && t3 != null
            && t4 != null
            && t5 != null
            && t6 != null
            && t7 != null) {
        block(t1, t2, t3, t4, t5, t6, t7)
    } else {
        null
    }
}

inline fun <T1, T2, T3, T4, T5, T6, T7, T8, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        t4: T4?,
        t5: T5?,
        t6: T6?,
        t7: T7?,
        t8: T8?,
        block: (T1, T2, T3, T4, T5, T6, T7, T8) -> R): R? {
    return if (t1 != null
            && t2 != null
            && t3 != null
            && t4 != null
            && t5 != null
            && t6 != null
            && t7 != null
            && t8 != null) {
        block(t1, t2, t3, t4, t5, t6, t7, t8)
    } else {
        null
    }
}

inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        t4: T4?,
        t5: T5?,
        t6: T6?,
        t7: T7?,
        t8: T8?,
        t9: T9?,
        block: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R): R? {
    return if (t1 != null
            && t2 != null
            && t3 != null
            && t4 != null
            && t5 != null
            && t6 != null
            && t7 != null
            && t8 != null
            && t9 != null) {
        block(t1, t2, t3, t4, t5, t6, t7, t8, t9)
    } else {
        null
    }
}

inline fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        t4: T4?,
        t5: T5?,
        t6: T6?,
        t7: T7?,
        t8: T8?,
        t9: T9?,
        t10: T10?,
        block: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R): R? {
    return if (t1 != null
            && t2 != null
            && t3 != null
            && t4 != null
            && t5 != null
            && t6 != null
            && t7 != null
            && t8 != null
            && t9 != null
            && t10 != null) {
        block(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)
    } else {
        null
    }
}
