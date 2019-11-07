public class Practice1{
    public static void main(String[] args){
        String a=String.format("%d",100);
        System.out.println(a);
        
        String b=String.format("%s","kunja");
        System.out.println(b);
        
        String c=String.format("%.6f",10.0);
        System.out.println(c);
        
        String d=String.format("%c",'k');
        System.out.println(d);
        
        System.out.printf(" %x ",100);
    }
}