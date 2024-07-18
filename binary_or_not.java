public class binary_or_not {
    public static void main(String[] args){
        int b=1011011;
//        String str=b+"";
        String str=String.valueOf(b);//static method.
        System.out.println(str.matches("[01]*"));
//        System.out.println(str.matches("[01]+"));

    }
}
