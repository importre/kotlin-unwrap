import com.importre.unwrap.Unwrap

inline fun <T1, R> unwrap(
        t1: T1?,
        block: Unwrap.(T1) -> R): Unwrap {
    return Unwrap().apply {
        if (t1 != null) {
            valid = true
            block(t1)
        }
    }
}

inline fun <T1, T2, R> unwrap(
        t1: T1?,
        t2: T2?,
        block: Unwrap.(T1, T2) -> R): Unwrap {
    return Unwrap().apply {
        if (t1 != null
                && t2 != null) {
            valid = true
            block(t1, t2)
        }
    }
}

inline fun <T1, T2, T3, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        block: Unwrap.(T1, T2, T3) -> R): Unwrap {
    return Unwrap().apply {
        if (t1 != null
                && t2 != null
                && t3 != null) {
            valid = true
            block(t1, t2, t3)
        }
    }
}

inline fun <T1, T2, T3, T4, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        t4: T4?,
        block: Unwrap.(T1, T2, T3, T4) -> R): Unwrap {
    return Unwrap().apply {
        if (t1 != null
                && t2 != null
                && t3 != null
                && t4 != null) {
            valid = true
            block(t1, t2, t3, t4)
        }
    }
}

inline fun <T1, T2, T3, T4, T5, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        t4: T4?,
        t5: T5?,
        block: Unwrap.(T1, T2, T3, T4, T5) -> R): Unwrap {
    return Unwrap().apply {
        if (t1 != null
                && t2 != null
                && t3 != null
                && t4 != null
                && t5 != null) {
            valid = true
            block(t1, t2, t3, t4, t5)
        }
    }
}

inline fun <T1, T2, T3, T4, T5, T6, R> unwrap(
        t1: T1?,
        t2: T2?,
        t3: T3?,
        t4: T4?,
        t5: T5?,
        t6: T6?,
        block: Unwrap.(T1, T2, T3, T4, T5, T6) -> R): Unwrap {
    return Unwrap().apply {
        if (t1 != null
                && t2 != null
                && t3 != null
                && t4 != null
                && t5 != null
                && t6 != null) {
            valid = true
            block(t1, t2, t3, t4, t5, t6)
        }
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
        block: Unwrap.(T1, T2, T3, T4, T5, T6, T7) -> R): Unwrap {
    return Unwrap().apply {
        if (t1 != null
                && t2 != null
                && t3 != null
                && t4 != null
                && t5 != null
                && t6 != null
                && t7 != null) {
            valid = true
            block(t1, t2, t3, t4, t5, t6, t7)
        }
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
        block: Unwrap.(T1, T2, T3, T4, T5, T6, T7, T8) -> R): Unwrap {
    return Unwrap().apply {
        if (t1 != null
                && t2 != null
                && t3 != null
                && t4 != null
                && t5 != null
                && t6 != null
                && t7 != null
                && t8 != null) {
            valid = true
            block(t1, t2, t3, t4, t5, t6, t7, t8)
        }
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
        block: Unwrap.(T1, T2, T3, T4, T5, T6, T7, T8, T9) -> R): Unwrap {
    return Unwrap().apply {
        if (t1 != null
                && t2 != null
                && t3 != null
                && t4 != null
                && t5 != null
                && t6 != null
                && t7 != null
                && t8 != null
                && t9 != null) {
            valid = true
            block(t1, t2, t3, t4, t5, t6, t7, t8, t9)
        }
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
        block: Unwrap.(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) -> R): Unwrap {
    return Unwrap().apply {
        if (t1 != null
                && t2 != null
                && t3 != null
                && t4 != null
                && t5 != null
                && t6 != null
                && t7 != null
                && t8 != null
                && t9 != null
                && t10 != null) {
            valid = true
            block(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10)
        }
    }
}
