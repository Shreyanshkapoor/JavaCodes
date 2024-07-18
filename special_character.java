public class special_character {
    public static void main(String[] args){
        String str="a!B@c#1#@#$%&*!~~2354";
        System.out.println(str.replaceAll("[^a-zA-z0-9]",""));
    }
}
