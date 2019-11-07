import java.util.Scanner;
public class Even{
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a number to five even");
        int i=num.nextInt();
        if(i%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

}