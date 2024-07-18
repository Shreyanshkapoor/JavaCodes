//public class Variable_argument {
//    static void showlist(int start,String ...var){
//        for(int i=0;i<var.length;i++){
//            System.out.println(start+"."+var[i]);
//            start++;
//        }
//    }
//    public static void main(String ...args){
//        showlist(1,"manoj","pankaj","shubham","sagar");
//
//    }
//}

import java.util.Scanner;

public class Variable_argument {
    static float discount(float price){
        float d;
        if(price<500){
            d= (float) (price-(price*0.1));
        }
        else {
             d = (float) (price - (price * 0.5));
        }
        return d;
    }
    public static void main(String ...args){
        Scanner s=new Scanner(System.in);
        float price;
        System.out.println("Enter the price: ");
        price=s.nextFloat();
        System.out.println("After Discount: ");
        System.out.print(discount(price));

    }
}