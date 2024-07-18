import java.lang.*;
import java.util.*;

public class cuboid {
    public static void main(String[] args){
        int l,w,h;
        int area,volume;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of a,b,c:");
        l=s.nextInt();
        w=s.nextInt();
        h=s.nextInt();
        area=2*(l*h+l*w+h*w);
        volume=l*w*h;
        System.out.println("Area of cuboid is:"+area);
        System.out.println("Volume of cuboid is:"+volume);
    }
}


