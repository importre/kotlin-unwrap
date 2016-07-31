package com.importre.unwrap

import org.junit.Test
import unwrap
import kotlin.test.assertEquals

class UnwrapTest {

    class Dummy1(val value: Int)
    class Dummy2(val value: String)

    @Test
    fun testWithoutNah() {
        val _a = Dummy1(1)
        val _b = Dummy2("1")
        var validCount = 0

        unwrap(_a, _b) { a, b ->
            validCount++
        }

        assertEquals(1, validCount)
    }

    @Test
    fun testHasNull() {
        val _a = Dummy1(1)
        val _b = null
        var validCount = 0
        var invalidCount = 0

        unwrap(_a, _b) { a, b ->
            validCount++
        } nah {
            invalidCount++
        }

        assertEquals(0, validCount)
        assertEquals(1, invalidCount)
    }

    @Test
    fun testHasNoNull() {
        val _a = Dummy1(1)
        val _b = Dummy1(2)
        var validCount = 0
        var invalidCount = 0

        unwrap(_a, _b) { a, b ->
            validCount++
            assertEquals(a.value, 1)
            assertEquals(b.value, 2)
        } nah {
            invalidCount++
        }

        assertEquals(1, validCount)
        assertEquals(0, invalidCount)
    }

    @Test
    fun testHasNoNullWith3Params() {
        val _a = Dummy1(1)
        val _b = Dummy1(2)
        val _c = Dummy2("unwrap")
        var validCount = 0
        var invalidCount = 0

        unwrap(_a, _b, _c) { a, b, c ->
            validCount++
            assertEquals(a.value, 1)
            assertEquals(b.value, 2)
            assertEquals(c.value, "unwrap")
        } nah {
            invalidCount++
        }

        assertEquals(1, validCount)
        assertEquals(0, invalidCount)
    }
}
