import java.util.Scanner;
public class TaxSystem{
    public static void main(String [] args)
    {
        int choice;
        double tax,income;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your choice:\n1.Couple\n2.Singal"+"\nYour Choice is:");
       
        choice=input.nextInt();
        
        switch(choice)
        {
            case 1:
            System.out.println("For Couple");
            System.out.println("Enter your income");
            income=input.nextInt();
            if(income<400000)
            {
                tax=income * 0.01;
                System.out.println("You have to pay Rs."+tax+" tax.");
            }
            else if(income==400000 &&income<500000)
            {
                tax=income * 0.1;
                System.out.println("You have to pay Rs."+tax+" tax.");
            }
            else if(income==500000 && income<700000)
            {
                tax=income * 0.2;
                System.out.println("You have to pay Rs."+tax+" tax.");
 
            }
             else if(income==700000 && income<2000000)
            {
                tax=income * 0.3;
                System.out.println("You have to pay Rs."+tax+" tax.");
 
            }
             else 
            {
                tax=income * 0.36;
                System.out.println("You have to pay Rs."+tax+" tax.");
 
            }
            break;
            
            case 2:
            System.out.println("For Singal");
            System.out.println("Enter your income");
            income=input.nextInt();
            if(income<350000)
            {
                tax=income * 0.01;
                System.out.println("You have to pay Rs."+tax+" tax.");
            }
            else if(income==350000 &&income<450000)
            {
                tax=income * 0.1;
                System.out.println("You have to pay Rs."+tax+" tax.");
            }
            else if(income==450000 && income<650000)
            {
                tax=income * 0.2;
                System.out.println("You have to pay Rs."+tax+" tax.");
 
            }
             else if(income==650000 && income<2000000)
            {
                tax=income * 0.3;
                System.out.println("You have to pay Rs."+tax+" tax.");
 
            }
             else 
            {
                tax=income * 0.36;
                System.out.println("You have to pay Rs."+tax+" tax.");
 
            }
            break;
            default:
            System.out.print("Invalid");
        }
        
    }

}