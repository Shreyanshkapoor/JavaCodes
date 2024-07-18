public class finds_words {
    public static void main(String[] args){
        String str=" abcd   dkvl  slfm   m   mm";
        str=str.replaceAll("\\s+"," ").trim();
        String words[]=str.split("\\s");
        System.out.println(words.length);
    }
}

    