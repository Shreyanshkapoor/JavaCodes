import java.util.Scanner;

public class leap_year {
    public static void main(String[] args){
        int d;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year: ");
        d=s.nextInt();
        if (d%4==0 && d%100!=0 || d%400==0){
            System.out.println("Leap Year.");
        }
        else{
            System.out.println("Not a Leap Year.");
        }
    }
}
