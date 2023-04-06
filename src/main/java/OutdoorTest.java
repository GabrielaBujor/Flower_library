import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OutdoorTest {

//    Outdoor outdoor = new Outdoor("Rose", Colour.PINK, 13, 5, "China");

    @Test
    public void testgetters(){
        Outdoor outdoor = new Outdoor("Rose", Colour.PINK, 13, 5, "China");

        assertEquals("Rose", outdoor.getName(), "Wrong text");
        assertEquals(Colour.PINK, outdoor.getColour(), "Wrong text");
        assertEquals(13, outdoor.getHeight(), "Wrong text");
        assertEquals(5, outdoor.getPrice(), "Wrong text");
        assertEquals("China", outdoor.getCountry(), "Wrong text");
    }

//    @Test
//    public void exceptionTesting(){
//        Throwable exception = assertThrows(IllegalArgumentException.class, ()->plant.setHeight("13"));
//        assertEquals("Age must be an Integer.", exception.getMessage());
//    }
}
