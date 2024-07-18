public class Extra_space {
    public static void main(String[] args){
        String str="   anhdk     wjskmx  jkwmx  ";
        System.out.println(str.replaceAll("\\s+","").trim() );// "\\s+ is the meta character and it is replace the spaces."
//        System.out.println(str.trim());// it can removes the leading spaces .



    }
}
