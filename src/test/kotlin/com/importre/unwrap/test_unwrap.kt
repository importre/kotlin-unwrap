package com.importre.unwrap

import org.junit.Test
import unwrap
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class UnwrapTest {

    class Dummy1(val value: Int)
    class Dummy2(val value: String)

    @Test
    fun testHasNull() {
        val _a = Dummy1(1)
        val _b = null
        var count = 0

        val result = unwrap(_a, _b) { a, b ->
            count++
        }

        assertNull(result)
        assertEquals(0, count)
    }

    @Test
    fun testHasNoNull() {
        val _a = Dummy1(1)
        val _b = Dummy1(2)
        var count = 0

        val result = unwrap(_a, _b) { a, b ->
            count++
            assertEquals(a.value, 1)
            assertEquals(b.value, 2)
        }

        assertNotNull(result)
        assertEquals(1, count)
    }

    @Test
    fun testHasNoNullWith3Params() {
        val _a = Dummy1(1)
        val _b = Dummy1(2)
        val _c = Dummy2("unwrap")
        var count = 0

        val result = unwrap(_a, _b, _c) { a, b, c ->
            count++
            assertEquals(a.value, 1)
            assertEquals(b.value, 2)
            assertEquals(c.value, "unwrap")
        }

        assertNotNull(result)
        assertEquals(1, count)
    }

    @Test
    fun testReturnValue() {
        val _a = Dummy1(1)
        val _b = Dummy2("unwrap")

        val result = unwrap(_a, _b) { a, b ->
            assertEquals(a.value, 1)
            assertEquals(b.value, "unwrap")
            a.value.toString() + b.value
        }

        assertNotNull(result)
        assertEquals("1unwrap", result)
    }
}
