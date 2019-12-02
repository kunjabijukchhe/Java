import java.util.*;
public class Grade{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the marks of eigth subject:");
        Double a=input.nextDouble();
        Double b=input.nextDouble();
        Double c=input.nextDouble();
        Double d=input.nextDouble();
        Double e=input.nextDouble();
        Double f=input.nextDouble();
        Double g=input.nextDouble();
        Double h=input.nextDouble();
        double sum=a+b+c+d+e+f+g+h;
        double num=sum/8;
        if(num>=90 && num<=100)
        {
            System.out.print("Grade A+");
        }
        else if (num>=80)
         {
            System.out.print("Grade A");
        }
         else if (num>=70)
         {
            System.out.print("Grade B+");
        }
         else if (num>=60)
         {
            System.out.print("Grade B");
        }
         else if (num>=50)
         {
            System.out.print("Grade C+");
        }
         else if (num>=40)
         {
            System.out.print("Grade C");
        }
         else if (num>=30)
         {
            System.out.print("Grade D+");
        }
         else if (num>=20)
         {
            System.out.print("Grade D");
        }
         else
         {
            System.out.print("Grade E");
        }
    }
}