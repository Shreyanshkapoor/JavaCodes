import java.util.Scanner;

public class websitewith_switch {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String url;
        System.out.println("Enter the url:");
        url=s.nextLine();
        String ext;
        ext=url.substring(url.lastIndexOf(".")+1);
        switch(ext){
            case "com":
                System.out.println("COMMERCIAL");
                break;
            case "net":
                System.out.println("NETWORK");
                break;
            case "org":
                System.out.println("ORGANISATION");
                break;
            default:
                System.out.println("INVALID INPUT");

        }



    }
}
