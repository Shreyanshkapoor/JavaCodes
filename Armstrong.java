import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        int num;
        int result=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        int num2=num;
        while(num>0){
            int r=num%10;
            num=num/10;
            result=result+r*r*r;
        }
        if (num2==result) {
            System.out.println("It is Armstrong number.");
        }
        else {
            System.out.println("It is not a Armstrong number.");
        }
    }
}
