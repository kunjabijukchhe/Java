import java.util.Scanner;
public class FindEven{
    public static void main(String[] args){
       
        Scanner input=new Scanner(System.in);
        System.out.print("How many integer values to process? ");
        int size=input.nextInt();
        int [] numbers=new int[size];
        System.out.print("Enter " +size+ " interger values: ");
        
        for(int i=0;i<size;i++)
        {
            numbers[i]=input.nextInt();
        }
        System.out.print("Even Number are: ");
        for(int i=0;i<size;i++)
        {
            if(numbers[i]%2==0)
            {
                System.out.print(numbers[i]+"\t");
                
            }
            
        }
            //int total=evenNumber(numbers);
            System.out.print("\nTotal even number are:" +evenNumber(numbers));
        
    }
 
    
    public static int evenNumber(int[] num)
    {
        int total=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]%2==0)
            {
              
                total+=num[i];
            }   
            
        }
        return total;
    }
}

