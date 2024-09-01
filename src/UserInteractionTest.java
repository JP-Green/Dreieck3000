import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class UserInteractionTest {

    UserInteraction userInteraction = new UserInteraction();

    @Test
    void testValidInput() {
        String input = "5\n5\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int[] sides = userInteraction.readSideLengthsForTriangle();

        assertArrayEquals(new int[]{5, 5, 5}, sides, "Eingabe sollte [5, 5, 5] sein.");
    }

    @Test
    void testInvalidInputAndRetry() {
        String input = "100\n99\n5\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int[] sides = userInteraction.readSideLengthsForTriangle();

        assertArrayEquals(new int[]{99, 5, 5}, sides, "Eingabe sollte nach Wiederholung [99, 5, 5] sein.");
    }

    @Test
    void testAskToRepeatYes() {
        String input = "y\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        boolean repeat = userInteraction.restart();

        assertTrue(repeat, "Eingabe 'j' sollte true zurückgeben.");
    }

    @Test
    void testAskToRepeatNo() {
        String input = "n\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        boolean repeat = userInteraction.restart();

        assertFalse(repeat, "Eingabe 'n' sollte false zurückgeben.");
    }
  
}