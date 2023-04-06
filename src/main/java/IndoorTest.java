import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IndoorTest {

    @Test
    public void testgetters() {
        Indoor indoor = new Indoor("Lily", Colour.WHITE, 15, 6, "Turkey");

        assertEquals("Lily", indoor.getName(), "Wrong text");
        assertEquals(Colour.WHITE, indoor.getColour(), "Wrong text");
        assertEquals(15, indoor.getHeight(), "Wrong text");
        assertEquals(6, indoor.getPrice(), "Wrong text");
        assertEquals("Turkey", indoor.getCountry(), "Wrong text");
    }
}
