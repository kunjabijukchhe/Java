import java.util.*;
public class MethodString{
    public static void Message(String name)
    {
        System.out.println("Your name is "+name);
    }
    
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name:");
        String userInput=input.nextLine();
        Message(userInput);
    }
}
        
        