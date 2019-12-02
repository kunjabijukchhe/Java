import java.util.Scanner;
public class HCF{
    public static void main(String [] args)
    {
        int h=0,min=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a two number:");
        int a=input.nextInt();
        int b=input.nextInt();
        if(a>b)
        {   min=b;
        }
        else
        {
            min=a;
        }
        for(int i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                h=i;
                
                
            }
  }
    System.out.print("The H.C.F of two number "+a+" and "+b+" is "+h);
}
}