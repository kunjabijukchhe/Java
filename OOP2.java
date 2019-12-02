
/**
 * Write a description of class OOP2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OOP2
{
    public static void main(String [] args)
    {   
       double c;
        OOP1 r=new OOP1();
        r.setLength(50);
        r.setWidth(40);
        c=r.getArea();
        System.out.println("Length is: "+r.getLength());
        System.out.println("Width is: "+r.getWidth());
        System.out.println("Area is: "+c+" sq.m");
        
    }
}
  