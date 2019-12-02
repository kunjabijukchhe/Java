import java.util.*;
public class RockPaperScissor{
    public static void main(String[] args)
    {
        String a="Rock";
        Random rand=new Random();
        Scanner userInput=new Scanner(System.in);
        
        System.out.print("Rock, Paper and Scissor\nUser: ");
        
        String input=userInput.nextLine();
        char computerInput;
        int randNo=rand.nextInt(3);
        if(randNo==0 )
        {
            
            computerInput='R';
            System.out.println("Computer: Rock");
            
        }
        else if(randNo==1)
        {
            System.out.print("Computer: Paper");
            computerInput='P';
        }
        else
        {
            System.out.print("Computer: Scissor");
            computerInput='S';
        }
        
        char userChoice=input.charAt(0);
        userChoice=Character.toUpperCase(userChoice);
        if(userChoice==computerInput)
        {
            System.out.print("Draw");
        }
        else if(userChoice=='R' && computerInput=='P')
        {
            System.out.print("Computer Win");
        }
        else if(userChoice=='R' && computerInput=='S')
        {
            System.out.print("User Win");
        }
        else if(userChoice=='P' && computerInput=='S')
        {
            System.out.print("Computer Win");
        }
        else if(userChoice=='P' && computerInput=='R')
        {
            System.out.print("User Win");
        }
        else if(userChoice=='S' && computerInput=='P')
        {
            System.out.print("User Win");
        }
        else if(userChoice=='S' && computerInput=='R')
        {
            System.out.print("computer Win");
        }
        else
        {
            System.out.print("Somethings goes worng!");
        }
            
       
      
        }
    } 
    
