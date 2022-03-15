package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing suma: 1+1=2")
    void sum() {
        // Arrange
        Long number1 = Long.valueOf(1);
        Long number2 = Long.valueOf(1);
        Long expectedValue = Long.valueOf(2);

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing subtract: 5-4=1")
    void subtract() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 4L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.subtract(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing multiply: 2*8=16")
    void multiply() {
        // Arrange
        Long number1 = 2L;
        Long number2 = 8L;
        Long expectedValue = 16L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing divide: 1/0=ERROR")
    void divide() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 0L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.divide(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
}