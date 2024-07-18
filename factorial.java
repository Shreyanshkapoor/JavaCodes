import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        long factorial=1;
        for(int i=1;i<=num;i++){
            factorial= factorial*i;
        }
        System.out.println("Factorial is:"+factorial);
    }
}
