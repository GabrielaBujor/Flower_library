import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Application {
    InputDevice id;
    OutputDevice od;

    public Application(InputDevice id, OutputDevice od){
        this.id = id;
        this.od = od;
    }

    private void Gardening(){
        ArrayList<Flower> flowers = id.Flowers();
        Flower.Gardening(flowers);

        for(Flower f : flowers){
            if(f instanceof Pests){
                System.out.println(((Pests) f).hasPests());
            }
            if(f instanceof Watered){
                System.out.println(((Watered) f).notWatered());
            }
        }
    }

    private void Market(ArrayList<Flower> flowers){
        od.writeMessage(Arrays.toString(flowers.toArray()));
        System.out.println("\n");
        od.writeMessage(Objects.requireNonNull(Flower.leastExpensive(flowers)));
        System.out.println("\n");
        od.writeMessage(String.valueOf(Flower.countCountry(flowers)));
        System.out.println("\n");
    }

    public void run(){
        this.Gardening();
        ArrayList<Flower> flowers = this.id.Flowers();
        this.Market(flowers);

    }

}
