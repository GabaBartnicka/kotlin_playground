import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class MainKtTest {

    @Test
    fun test1() {
        assertTrue(isValidIdentifier("name"))
    }

    @Test
    fun test2() {
        assertTrue(isValidIdentifier("_name"))
    }

    @Test
    fun test3() {
        assertTrue(isValidIdentifier("_12"))
    }

    @Test
    fun test4() {
        assertFalse(isValidIdentifier(""))
    }

    @Test
    fun test5() {
        assertFalse(isValidIdentifier("012"))
    }

    @Test
    fun test6() {
        assertFalse(isValidIdentifier("no$"))
    }
}