
import java.util.Scanner;
public class Input3
{
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a first number:");
        int a=num.nextInt();
        System.out.println("Enter a second number:");
        int b=num.nextInt();
        System.out.println("Enter a third number:");
        int c=num.nextInt();
        
        if(a>b &&a>c)
        {
            System.out.println("The greatest number is "+a);
        }
        else if(b>c)
        {
            System.out.println("The greatest number is "+b);
        }
        else
        {
            System.out.println("The greatest number is "+c);
        }
    }
}
        
       