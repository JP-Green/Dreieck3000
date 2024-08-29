import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class UserInteractionTest {

    UserInteraction userInteraction = new UserInteraction();

    @Test
    void testValidInput() {
        String input = "5\n5\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int[] sides = userInteraction.readValues();

        assertArrayEquals(new int[]{5, 5, 5}, sides, "Eingabe sollte [5, 5, 5] sein.");
    }

    @Test
    void testInvalidInputAndRetry() {
        String input = "100\n5\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        int[] sides = userInteraction.readValues();

        assertArrayEquals(new int[]{5, 5, 5}, sides, "Eingabe sollte nach Wiederholung [5, 5, 5] sein.");
    }

    @Test
    void testAskToRepeatYes() {
        String input = "j\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        String repeat = userInteraction.restart();

        assertEquals("j", repeat, "Eingabe sollte 'j' sein.");
    }

    @Test
    void testAskToRepeatNo() {
        String input = "n\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        String repeat = userInteraction.restart();

        assertEquals("n", repeat, "Eingabe sollte 'n' sein.");
    }
  
}