import java.util.Scanner;

public class Arithmetic_progression {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Term a,d,n:");
        int a=s.nextInt();
        int d=s.nextInt();
        int n=s.nextInt();
        int term=a;
        System.out.println("Arithematic Series.");
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term=term+d;
        }

    }
}
