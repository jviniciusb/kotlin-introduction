import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val expected = listOf("CAR", "MOTORCYCLE", "AIRPLANE").sorted()
        val result = VehicleType.values().sortedBy { it.name }
        Assert.assertEquals(expected, result)
    }
}