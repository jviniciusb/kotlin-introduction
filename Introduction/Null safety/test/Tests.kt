import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {

        val result1 = uppercaseReversed("Kotlin")
        val expected1 = "NILTOK"

        val result2 = uppercaseReversed(null)
        val expected2 = ""

        Assert.assertEquals(expected1, result1)
        Assert.assertEquals(expected2, result2)
    }
}