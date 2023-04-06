public class Indoor extends Flower implements Pests, Watered{
    boolean pests = true;
    boolean watered = false;

    public Indoor(String name, Colour colour, double height, int price, String country){
        this.setName(name);
        this.setColour(colour);
        this.setHeight(height);
        this.setFertilizer("NPK");
        this.setPrice(price);
        this.setCountry(country);
    }

    @Override
    public boolean hasPests(){return this.pests;}

    @Override
    public void removePests(){this.pests = false;}

    @Override
    public boolean notWatered(){return this.watered;}

    @Override
    public void Watered(){this.watered = true;}
}
