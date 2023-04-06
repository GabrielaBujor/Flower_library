import java.util.*;

public abstract class Flower {
    private String name;
    private double height;
    private Colour colour;
    private String fertilizer;
    private int price;
    private String country;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public String getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(String fertilizer) {
        this.fertilizer = fertilizer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static void Gardening(ArrayList<Flower> flowers){
        for(Flower f : flowers){
            if(f instanceof Pests){
                ((Pests) f).removePests();
            }
            if(f instanceof Watered){
                ((Watered) f).Watered();
            }
        }
    }

    public static HashMap<String, Integer> countFlowers(Collection<Flower> flowers){
        HashMap<String, Integer> FlowerMap = new HashMap<String, Integer>();
        for(Flower f : flowers){
            String flower_name = f.getName();
            if(FlowerMap.containsKey(f.getName())){
                FlowerMap.put(flower_name, FlowerMap.get(flower_name)+1);
            }
            else{
                FlowerMap.put(flower_name, 1);
            }
        }
        return FlowerMap;
    }

    public static String leastExpensive(Collection<Flower> flowers){
        HashMap<String, Integer> FlowerMap = Flower.countFlowers(flowers);
        int maximum_value = Collections.max(FlowerMap.values());
        for(Map.Entry<String, Integer> entry: FlowerMap.entrySet()){
            if(entry.getValue() == maximum_value){
                return entry.getKey();
            }
        }
        return null;
    }

    public static HashMap<String, Integer> countCountry(Collection<Flower> flowers){
        HashMap<String, Integer> Country = new HashMap<String, Integer>();
        for(Flower f : flowers){
            String country_name = f.getCountry();
            if(Country.containsKey(f.getCountry())){
                Country.put(country_name, Country.get(country_name)+1);
            }
            else{
                Country.put(country_name, 1);
            }
        }
        return Country;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name= " + name +
                ", height= " + height +
                "cm, colour= " + colour +
                ", fertilizer= " + fertilizer +
                ", price= " + price +
                "$, country= " + country +
                '}';
    }

}
