import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {

        Assert.assertEquals("[yes, no, may be]", toJsonString(listOf("yes", "no", "may be")))
    }
}