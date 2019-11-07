import java.util.*;
public class Assessment{
    public static void main(String [] args)
    {
        //int min=10;
        //int max=90;
        Random rand=new Random();
        Scanner input=new Scanner(System.in);
        
        int randNo=10+rand.nextInt(80);
        //int randNo=(int)(Math.random()*((max-min)+1))+min;
        //int randNo=(int)(Math.random()*(max-min)+min;
        int i=1;
        while(i<=10)
        {
            
            System.out.print("Guess "+i+":");
            i++;
            int userInput=input.nextInt();
            if(randNo!=userInput)
            {
                if(userInput>randNo)
                {
                
                    System.out.println("Hint:Lower");
                }
                else
                {
                    System.out.println("Hint:Higher");
                }
        
            
            }
            else
            {
                i--;
                System.out.println("Correct after only "+i+" guesses- brilliant!");
            
                break;
            }
            if(i>10)
            {
                System.out.println("Out of guesses");
            }
        
        
        }
    }
}