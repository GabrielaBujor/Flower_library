class InvalidCountryException extends Exception{
    public InvalidCountryException(String s)
    {
        super(s);
    }
}

public class CustomException3 {
    static void validate(String country) throws InvalidCountryException{
        if(country.length() > 20){
            throw new InvalidCountryException("country name is too long");
        }
        else {
            System.out.println("country name has been added");
        }
    }

    public static void main(String args[]){
        try{
            validate("The United Kingdom of Ireland");
        }
        catch (InvalidCountryException e)
        {
            System.out.println(e);
        }
    }
}
