import java.util.*;
public class Price{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("\t\t*** Price Comparision ***");
        System.out.print("Enter the quantity of rice: Rs.");
        int a=input.nextInt();
        int c=250;
        int rate1=a*c;
        System.out.print("Enter the quantity of sugar: Rs.");
        int b=input.nextInt();
        int d=200;
        int rate2=b*d;
        if(rate1>rate2)
        {
            System.out.print("The price of rice is greater than price of sugar.");
        }
        else
        {
             System.out.print("The price of  sugar is greater than price of  rice.");

        }
    }
}