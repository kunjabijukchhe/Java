//This is my frist program of java

/*public class hello
    {
        public static void main(String [] args)
            {
                System.out.println("Hello World!");
            }
        }*/
        import java.util.Scanner;
        public class hello{
            public static void main(String []args)
            {
                
                String name;
                
                Scanner userInput=new Scanner(System.in);
        
               
        
                System.out.println("Enter the customer name: ");
                name=userInput.nextLine();
        
                
                
                System.out.println("Customer Name: "+name);
                
            }
            
        }