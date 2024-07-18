import java.util.Scanner;

public class prime_number {
    static boolean prime_num(int n){
        for(int i=2;i<n/2;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value:");
        n=s.nextInt();
        System.out.println(prime_num(n));
    }
}
