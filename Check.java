import java.util.Scanner;
public class Check{
    public static void main(String[] args)
    {
        Scanner userInput=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=userInput.nextInt();
        if(num %5==0 && num %7==0)
        {
            System.out.println("Number is divisible by 5 and 7");
        }
        else if(num %5==0)
        {
            
         System.out.println("Number is divisible by 5 but not 7");
         }
         else if(num%7==0)
         {
          System.out.println("Number is divisible by 7 but not 5");
           }
        
        
        else
        {
            System.out.println("Number is  not divisible by 5 and 7");
        }
    }
}