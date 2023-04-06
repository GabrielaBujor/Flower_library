class InvalidNameException extends Exception{
    public InvalidNameException(String s)
    {
        super(s);
    }
}

public class CustomException2 {
    static void validate(String name) throws InvalidNameException{
        if(name.length() > 35){
            throw new InvalidNameException("name is too long");
        }
        else {
            System.out.println("name has been added");
        }
    }

    public static void main(String args[]){
        try{
            validate("Christmas Carol was written by an American.");
        }
        catch (InvalidNameException e)
        {
            System.out.println(e);
        }
    }
}
