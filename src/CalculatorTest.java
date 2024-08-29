import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testEquilateralTriangle() {
        int[] sides = {5, 5, 5};
        String result = calculator.determineTriangleType(sides);
        assertEquals("Gleichseitiges Dreieck", result, "Sollte ein gleichseitiges Dreieck sein.");
    }

    @Test
    void testIsoscelesTriangle() {
        int[] sides = {5, 5, 3};
        String result = calculator.determineTriangleType(sides);
        assertEquals("Gleichschenkliges Dreieck", result, "Sollte ein gleichschenkliges Dreieck sein.");
    }

    @Test
    void testScaleneTriangle() {
        int[] sides = {4, 5, 6};
        String result = calculator.determineTriangleType(sides);
        assertEquals("Unregelmäßiges Dreieck", result, "Sollte ein unregelmäßiges Dreieck sein.");
    }

    @Test
    void testNoTriangle() {
        int[] sides = {1, 2, 3};
        String result = calculator.determineTriangleType(sides);
        assertEquals("Kein Dreieck", result, "Sollte kein Dreieck sein.");
    }

    @Test
    void testInvalidTriangle() {
        int[] sides = {10, 1, 1};
        String result = calculator.determineTriangleType(sides);
        assertEquals("Kein Dreieck", result, "Sollte kein Dreieck sein.");
    }

    @Test
    void testAnotherInvalidTriangle() {
        int[] sides = {2, 2, 4};
        String result = calculator.determineTriangleType(sides);
        assertEquals("Kein Dreieck", result, "Sollte kein Dreieck sein.");
    }

    @Test
    void testMaxEquilateralTriangle() {
        int[] sides = {99, 99, 99};
        String result = calculator.determineTriangleType(sides);
        assertEquals("Gleichseitiges Dreieck", result, "Sollte ein gleichseitiges Dreieck sein.");
    }

    @Test
    void testLargeAndSmallInvalidTriangle() {
        int[] sides = {99, 1, 1};
        String result = calculator.determineTriangleType(sides);
        assertEquals("Kein Dreieck", result, "Sollte kein Dreieck sein.");
    }

    @Test
    void testValidScaleneTriangle() {
        int[] sides = {50, 49, 1};
        String result = calculator.determineTriangleType(sides);
        assertEquals("Unregelmäßiges Dreieck", result, "Sollte ein unregelmäßiges Dreieck sein.");
    }
}