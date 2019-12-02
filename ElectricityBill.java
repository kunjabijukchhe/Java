
/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ElectricityBill
{
    private int customerId;
    private String name;
    private int units;
    private int amount;
    
    public void input()
    {
        Scanner userInput=new Scanner(System.in);
        
        System.out.println("Enter the customer id: ");
        customerId=userInput.nextInt();
        
        System.out.println("Enter the customer name: ");
        name=userInput.next();
        
        System.out.println("Enter the number of units consumed: ");
        units=userInput.nextInt();
    }
    public void calc()
    {
        if(units<=20)
        {
            amount=7*units;
        }
        else if(units<=80)
        {
            amount=140+(10*(units-20));
        }
        else if(units<=120)
        {
            amount=740+(15*(units-80));
        }else
        {
            amount=1370+(20*(units-120));
        }
    } 
    
    public void display()
    {
        calc();
        
        System.out.println(customerId+"\t\t"+name+"\t"+units+"\t\t"+amount+"\t");
        
        
    }
    
    public static void main(String []args)
    {
        ElectricityBill billOne=new ElectricityBill();
        ElectricityBill billTwo=new ElectricityBill();
        billOne.input();
        billTwo.input();
        
        System.out.print("Customer Id\t");
        System.out.print("Name\t");
        System.out.print("Units Consumed\t");
        System.out.println("Amount\t");
        
        billOne.display();
        billTwo.display();
        
        
    }
 
    }
    
    
    
    

    
    
