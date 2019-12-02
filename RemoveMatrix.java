import java.util.*;
public class RemoveMatrix{
    public static void Add()
    {
        Scanner input1=new Scanner(System.in);
        ArrayList<String> nameList1=new ArrayList<String>();
        System.out.print("Enter the name to add:");
        String a=input1.nextLine();
        nameList1.add(a);
        
    }
    public static void Remove()
    {
        
        Scanner input2=new Scanner(System.in);
        ArrayList<String> nameList2=new ArrayList<String>();
        System.out.print("Enter the name to remove:");
        String b=input2.nextLine();
        nameList2.remove(b);
        
    }
    public static void Display(String name)
    {
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(name);
        }
    }
    public static void main(String[] args)
    {
        int choice;
        String a,b;
        Scanner input=new Scanner(System.in);
        ArrayList<String> nameList=new ArrayList<String>();
        while(true)
        {
            System.out.print("add:1 , remove:2 , display:3\nYour choice is:");
            choice=input.nextInt();
            switch(choice)
            {
                case 1:
                    //System.out.print("Enter the name to add:");
                    //a=input.nextLine();
                    //nameList.add(a);
                    Add();
                    break;
                
                case 2:
                    //System.out.print("Enter the name to remove:");
                    //b=input.nextLine();
                    //nameList.remove(b);
                    Remove();
                    break;
                
                case 3:
                    Display(nameList);
                    break;
                
                default:
                    System.out.print("Invalid");
            }
           System.out.println("Do you want to continue y or n");
           String c = input.nextLine();
           if(c.equalsIgnoreCase("n"))
           { 
               break;
           }
    }
  }
}
