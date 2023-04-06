class InvalidPriceException extends Exception{
    public InvalidPriceException(String s)
    {
        super(s);
    }
}

public class CustomException1 {
    static void validate(int price) throws InvalidPriceException{
        if(price>100){
            throw new InvalidPriceException("price is too high");
        }
        else {
            System.out.println("price has been added");
        }
    }

    public static void main(String args[])
    {
        try
        {
            validate(120);
        }
        catch (InvalidPriceException e)
        {
            System.out.println(e);
        }
    }
}

