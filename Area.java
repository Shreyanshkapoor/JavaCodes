import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Area {
    public static void main(String[] args){
        float s;
        float a,b,c;
        Scanner z=new Scanner(System.in);
        System.out.println("Enter the value of a,b and c:");
        a=z.nextFloat();
        b=z.nextFloat();
        c=z.nextFloat();
        s=(a+b+c)/2;
        double f= sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of rectangle is :"+f);
    }
}
