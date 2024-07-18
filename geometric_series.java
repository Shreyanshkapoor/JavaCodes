import java.util.Scanner;

public class geometric_series {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the term a,r and n:");
        int a=s.nextInt();
        int r=s.nextInt();
        int n=s.nextInt();
        int term=a;
        System.out.println("Geometric Series~~");
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term=term*r;
        }


    }
}
