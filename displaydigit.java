import java.util.Scanner;

public class displaydigit {
    public static void main(String[] args){
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the digit number:");
        num=s.nextInt();
        while (num>0){
            int r=num%10;
            num=num/10;
            System.out.println(r);// print all digit in reverse order.

        }
//        int first=num/100;
//        int d=num%100;
//        int second=d/10;
//        int third=d%10;
//        System.out.println("First digit:"+first);
//        System.out.println("Second digit is:"+second);
//        System.out.println("Third digit is:"+third);

    }
}
