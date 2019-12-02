import java.util.Scanner;
public class PrimeNumber{
    public static void main (String [] args)
    {
        int flag=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=input.nextInt();
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
            }
           
         if(flag==1)
         {
             System.out.print("Not Prime Number");
         }
         else
         {
             System.out.print("Prime Number");
         }
            }
        }
        
        
    
    
