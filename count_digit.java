import java.util.Scanner;

public class count_digit {
    public static void main(String[] args){
        int num;
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        while (num>0) {
            num = num / 10;
            count+=1;
        }
        System.out.println("The length of digit is:"+count);// print all digit in reverse order.}
    }

}
