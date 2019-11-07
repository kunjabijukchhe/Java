import java.util.Scanner;

public class Input2{
    
        public static void main(String[] args)
        {
           Scanner num= new Scanner(System.in);
           System.out.println("Enter a first number:");
           int a=num.nextInt();
           
           System.out.println("Enter a second number:");
           int b=num.nextInt();
           
           int sum=a+b;
           System.out.println("The sum of two number is "+sum);
        }
           
        }
