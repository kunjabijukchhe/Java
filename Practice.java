import java.util.*;
public class Practice{
    public static void main(String[] args){
        int i=0;
       Scanner input=new Scanner(System.in);
       System.out.print("Enter number for multiply table:");
       int b=input.nextInt();
       for (i=1;i<=10;i++)
       
        {
            //String b=String.format("%d",a);
            System.out.println(b+" * "+i+" = "+(b*i));
    }
}
}