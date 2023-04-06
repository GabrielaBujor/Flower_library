import java.io.IOException;
import java.util.ArrayList;

public class Threads extends Thread {

    private static int no = 0;
    private int threadno;
    private String name;
    private Colour colour;
    private int height;
    private int price;
    private String country;
    private String name1;
    private Colour colour1;
    private int height1;
    private int price1;
    private String country1;



    public Threads() {
        this.threadno = ++no;
        this.name = "Rose";
        this.colour = Colour.PINK;
        this.height = 15;
        this.price = 5;
        this.country = "China";
        this.name1 = "Lilly";
        this.colour1 = Colour.WHITE;
        this.height1 = 12;
        this.price1 = 7;
        this.country1 = "Greece";
    }

    @Override
    public void run() {
        for (int i = 0; i <= 7; i++)
            if (i % 2 == 0)
                System.out.println("Thread " + this.threadno + ": name: " + this.name + ", colour: " + this.colour + ", height: " + this.height + ", price:" + this.price + "$, country: " + this.country);
            else if (i % 2 == 1)
                System.out.println("Thread " + this.threadno + ": name: " + this.name1 + ", colour: " + this.colour1 + ", height: " + this.height1 + ", price:" + this.price1 + "$, country: " + this.country1);
    }

    public static void main(String[] args) {
        Thread thread1 = new Threads();
        Thread thread2 = new Threads();

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

