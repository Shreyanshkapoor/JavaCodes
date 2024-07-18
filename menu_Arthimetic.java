import java.util.Scanner;

public class menu_Arthimetic {
    public static void main(String[] args){
        float num1,num2;
        float result;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1=s.nextFloat();
        System.out.println("Enter the Second number:");
        num2=s.nextFloat();
        String operation;
        System.out.println("\nf<---------MENU--------->\n");
        System.out.println("1.Sum(+)\n2.Substraction(-)\n3.Multiplication(*)\n4.Division(/)\n");
        System.out.println("Enter the operation Symbol:");
        operation=s.nextLine();
        operation=s.nextLine();

        switch (operation){
            case "+":
                result=num1+num2;
                System.out.println("Sum of two number is:"+ result);
                break;
            case "-":
                result=num1-num2;
                System.out.println("Substraction of two number is:"+ result);
                break;
            case "*":
                result=num1*num2;
                System.out.println("Product of two number is:"+ result);
                break;
            case "/":
                result=num1/num2;
                System.out.println("Division of two number is:"+ result);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("Program Ends");
    }
}
