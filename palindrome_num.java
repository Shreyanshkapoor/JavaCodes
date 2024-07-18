import java.util.Scanner;
public class palindrome_num {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the number:");
        n=s.nextInt();
        int m=n;
        int rev=0,r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if(rev==m){
            System.out.println("Number is palindrome.");
        }
        else{
            System.out.println("Number is not palindrome.");
        }




    }
}
