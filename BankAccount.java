
/**
 * Write a description of class Bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BankAccount
{
    private double balance;
    public BankAccount()
    {
        balance=10000;
        
    }
    public BankAccount(double startBalance)
    {
        balance=startBalance;
    }
    public BankAccount(String str)
    {
        balance=Double.parseDouble(str);
    }
    public void deposit(double amount)
    {
        balance+=amount;
    }
    public void deposit(String str)
    {
        balance+=Double.parseDouble(str);
    }
    public void withdraw(double amount)
    {
        balance-=amount;
    }
    public void withdraw(String str)
    {
        balance-=Double.parseDouble(str);
        
    }
    public void setBalance(double b)
    {
        balance=b;
    }
    public void setBalance(String str)
    {
        balance=Double.parseDouble(str);
    }
    public double getBalance()
    {
        return balance;
    }
    
    public static void main(String[] args)
    {
        BankAccount bank=new BankAccount();
        Scanner input=new Scanner(System.in);
        //Double userInput=input.nextDouble();
        int choice;
        String c="";
        
        do
        {
            System.out.print("deposit:1 , withdraw:2 , display:3\nYour choice is:");
            choice=input.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the amount to deposit:");
                Double userInput=input.nextDouble();
                bank.deposit(userInput);
            }
            else if(choice==2)
            {
                System.out.println("Enter the amount to withdraw:");
                Double userInput=input.nextDouble();
                bank.withdraw(userInput);
                           
            }
            else if(choice==3)
            {
                System.out.print("Your Current Balance is:Rs.");
                System.out.println(bank.getBalance());
            }
            else
            {
                System.out.println("Invalid");
            }
            System.out.print("Do you want to continue y or n:");
            c = input.next();
        }
        while(c.equalsIgnoreCase("Y"));
        }
 
    }

