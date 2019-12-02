import java.util.*;
public class Equation{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Input a:");
        double a=input.nextDouble();
        System.out.print("Input b:");
        double b=input.nextDouble();
        System.out.print("Input c:");
        double c=input.nextDouble();
        
        
        double result=b*b-4.0*a*c;
        
        
        if(result>0)
        {
            double positiveNo=(-b + Math.pow(result,0.5)/(2*a));
            double negativeNo=(-b - Math.pow(result,0.5)/(2*a));
            
            System.out.println("The root are "+positiveNo+" and "+negativeNo+".");
            
        }
        else if(result==0)
        {
            double num= -b /(2 * a);
            
            System.out.println("The root is "+num);
        }
        else
        {
            System.out.println("The given equation has no real root.");
        }
    }
}