import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val message = " message with spaces "
        Assert.assertEquals("messagewithspaces", message.removeSpaces())
    }
}