import org.junit.Assert
import org.junit.Test

class Test {
    @Test fun testSolution() {
        val car1 = Car("Ferrari", "F8")
        val car2 = car1.copy("Lamborghini", "Aventador")
        // This test will pass only if the copy method is available
        Assert.assertNotEquals(car1, car2)
    }
}