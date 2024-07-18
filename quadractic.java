import java.lang.*;
import java.util.*;

public class quadractic {
    public static void main(String[] args){
        int a,b,c;
        double r1,r2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a,b and c:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        double dis=Math.sqrt((b*b)-(4*a*c));
        r1=(-b+dis)/(2*a);
        r2=(-b-dis)/(2*a);
        System.out.println("Root are:"+r1+" "+r2);



    }
}
