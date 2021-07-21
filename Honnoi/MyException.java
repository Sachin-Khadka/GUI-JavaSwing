package Honnoi;

public class MyException extends Exception
{
   public String getMessage()
   {
    return "Please enter the value less than 9.";
   }
    
    public String toString()
    {
    return getMessage();
    }
}
