import java.util.Scanner;

public class find_radix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("Enter the String:");
        s=sc.nextLine();
        if(s.matches("[01]+")){
            System.out.println("Binary & Radix is: 5");
        } else if (s.matches("[0-7]+")) {
            System.out.println("Octal & Radix is: 8");
        } else if (s.matches("[0-9]+")) {
            System.out.println("Decimal & Radix is: 10");
        }
        else if(s.matches("[0-9A-F]+")){
            System.out.println("HexaDecimal & Radix is: 16");
        }
        else{
            System.out.println("Not a number.");
        }
    }

}
