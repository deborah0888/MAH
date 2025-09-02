package in.kmit.MyJavaProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 5);
        assertEquals(15, result, "10 + 5 should be 15");
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        int result = calc.subtract(10, 5);
        assertEquals(5, result, "10 - 5 should be 5");
    }

    @Test
    void testAdditionWithNegativeNumbers() {
        Calculator calc = new Calculator();
        int result = calc.add(-3, -7);
        assertEquals(-10, result, "-3 + -7 should be -10");
    }

    @Test
    void testSubtractionWithNegativeNumbers() {
        Calculator calc = new Calculator();
        int result = calc.subtract(-3, -7);
        assertEquals(4, result, "-3 - (-7) should be 4");
    }
}
