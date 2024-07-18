import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n;
        n=s.nextInt();
        int rev=0,r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        System.out.println("Reverse of a number is: "+rev);

    }
}
