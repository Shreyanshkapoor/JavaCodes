//import java.util.function.DoubleBinaryOperator;

public class Student_challenge_01 {
    public static void main(String[] args){
        String str="programmer@gmail.com";
        int s=str.indexOf("@");
        String Uname =str.substring(0,s);
        String Dname=str.substring(s+1,str.length());
        System.out.println("Username is:"+Uname);
        System.out.println("Domain name is:"+Dname);
        System.out.println(Dname.startsWith("gmail"));

    }
}

