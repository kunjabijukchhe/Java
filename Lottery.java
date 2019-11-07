import java.util.*;
public class Lottery{
    public static void main(String [] args){
        Scanner userInput=new Scanner(System.in);
        //Random random=new Random();
        System.out.println("Enter a two ditits number:");
        int input=userInput.nextInt();
        
        int userFirst=input/10;
        
        int userLast=input%10;
        //System.out.println("First number is "+userFirst);
        //System.out.println("Second number is "+userLast);
        int a=(int)(Math.random()*100);
        //System.out.println("Lottery number is "+a);
        
        int lottFirst=a/10;
        int lottLast=a%10;
        //System.out.println("First number is "+lottFirst);
        //System.out.println("Second number is "+lottLast);
        
        if(input==a)
        {
            System.out.println("You have won $10000"+" \n\t\t***Lottery number is "+a+"***");
        }
        else if((lottFirst==userFirst ||lottFirst==userLast) && (lottLast==userFirst || lottLast==userLast))
        {
            System.out.println("You have won $50000"+" \n\t\t***Lottery number is "+a+"***");
        }
        else if((lottFirst==userFirst ||lottFirst==userLast) || (lottLast==userFirst || lottLast==userLast))
        {
            System.out.println("You have won $25000"+" \n\t\t***Lottery number is "+a+"***");
        }
        else{
            System.out.println("You lose"+" \n\t\t***Lottery number is "+a+"***");
        }
        
        
        
    }
}