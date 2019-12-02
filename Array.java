public class Array{
    public static void main(String [] args)
    {
        int[] number={1,2,3,4,5,6};
        //number= new int[50];
        int high =number[0];
        for(int i=1;i<number.length;i++)
        {
            if(number[i]>high)
            high=number[i];
            System.out.println(high);
        }
        
        
            
    }
}
/*public class Array{
    public static void main(String [] args)
    {
        int[] number={5,4,3};
        for(int val:number)
        {
            System.out.println(val);
        }
            
    }
}*/
        