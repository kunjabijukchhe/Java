public class Pattern{
    public static void main(String [] args)
    {
        int a=0,b=9,sum,d=2;
        for(int i=1;i<10;i++)
        {
            a=(a*10)+i;
            //sum=(a*b)+d;
            System.out.println(a+"*"+b+"+"+d+"="+((a*b)+d));
            d++;
        }
        
        
        
    }
}