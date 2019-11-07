import java.util.Scanner;
public class Loop1{
    public static void main(String[] args)
    {
        int sum=0,num;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter how many number");
        int n=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            num=input.nextInt();
            sum=sum+num;
        }
        System.out.println(sum);
    }
}