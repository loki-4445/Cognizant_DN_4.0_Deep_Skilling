package exericse_4;


import example.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup: Runs before each @Test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed.");
    }

    // Teardown: Runs after each @Test
    @After
    public void tearDown() {
        System.out.println("Teardown completed.");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }

    @Test
    public void testDivisionByZero() {
        // Arrange
        int a = 5;
        int b = 0;

        // Act & Assert
        try {
            calculator.divide(a, b);
            fail("Exception was expected");
        } catch (IllegalArgumentException e) {
            assertEquals("Divide by zero", e.getMessage());
        }
    }
}
