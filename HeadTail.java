import java.util.*;
public class HeadTail{
    public static void main(String[] args)
    {
        Random random=new Random();
        int randNo=random.nextInt(2);
        
        if(randNo==0)
        {
            System.out.println("Head");
        }
        else{
            System.out.println("Tail");
        }
        
    }
}