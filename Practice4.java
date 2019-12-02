/*import java.util.*;
public class Practice4{
    public static void main(String [] args)
    {
        ArrayList<String> array=new ArrayList<String>();
        array.add("kunja");
        array.add("bijukchhe");
        for(String i:array)
        {
        System.out.println(i);
    }
    
    
    String a=new String("kunja bijukchhe kunja");
    System.out.println(a.indexOf('k'));
    System.out.println(a.indexOf(10));
    System.out.println(a.indexOf('u',4));
    System.out.println(a.substring(10));
}
}*/
import java.util.*;
public class Practice4{
    public static void main(String [] args)
    {
        int choice;
        String a,b,c="";
        Scanner input=new Scanner(System.in);
        ArrayList nameList=new ArrayList();
        do
        {
            System.out.print("add:1 , remove:2 , display:3\nYour choice is:");
            choice=input.nextInt();
            if(choice==1)
                {
                    System.out.print("Enter the name to add:");
                    a=input.nextLine();
                    //nameList.add(a);
                }
                
            else if(choice==2)
                {
                    System.out.print("Enter the name to remove:");
                    b=input.nextLine();
                    //nameList.remove(b);
                }
                
            else if(choice==3)
                {
                    System.out.println(nameList);
                }
                
            else{
                    System.out.print("Invalid");
                }
           
        
           System.out.println("Do you want to continue y or n");
           c = input.nextLine();
           }
           while(c.equalsIgnoreCase("Y"));
        }
    }

  

