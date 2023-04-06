import java.io.InputStream;
import java.util.ArrayList;

public class InputDevice {

    private InputStream is;

    public InputDevice(){is = System.in;}

    public InputDevice(InputStream is){this.is = is;}

    public ArrayList<Flower> Flowers(){
        ArrayList<Flower> flowers = new ArrayList<>();
        flowers.add(new Outdoor("Rose", Colour.PINK, 12, 8, "China"));
        flowers.add(new Outdoor("Tulip", Colour.WHITE, 10, 5, "Netherlands"));
        flowers.add(new Outdoor("Rose", Colour.RED, 14, 7, "North America"));
        flowers.add(new Outdoor("Peony", Colour.PINK, 12, 5, "China"));
        flowers.add(new Outdoor("Rose", Colour.PINK, 14, 8, "China"));
        flowers.add(new Outdoor("Tulip", Colour.YELLOW, 13, 5, "Turkey"));
        flowers.add(new Outdoor("Rose", Colour.WHITE, 12, 6, "China"));
        flowers.add(new Outdoor("Rose", Colour.YELLOW, 18, 9, "Bulgaria"));
        flowers.add(new Outdoor("Tulip", Colour.PINK, 16, 7, "Switzerland"));
        flowers.add(new Indoor("Lily", Colour.WHITE, 12, 6, "Greece"));
        flowers.add(new Indoor("Money tree", Colour.GREEN, 13, 15, "China"));
        flowers.add(new Indoor("Philodendron", Colour.GREEN, 20, 20, "Colombia"));
        flowers.add(new Indoor("Christmas cactus", Colour.PINK, 7, 13, "Brazil"));
        return flowers;
    }
}
