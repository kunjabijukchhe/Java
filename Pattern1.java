import java.util.Scanner;
public class Pattern1{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Size of array:");
        int n=input.nextInt();
        int[] arrayElement=new int[n];
        
        for(int i=0;i<n;i++)
        {
        arrayElement[i]=input.nextInt();
        
        }
        /*for(int i=0;i<n;i++)
        {
        
        System.out.print(arrayElement[i]+"\t");
        
        }*/
        for(int val:arrayElement)
        {
            System.out.print(val+"\t");
        }
    }
    }
