import java.util.Scanner;

public class website_name {
    public static void main(String[] args){
        String url;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the url:");
        url=s.nextLine();
        String protocol=url.substring(0,url.indexOf(":"));
        if(protocol.equals("http")){
            System.out.println("HyperText Transfer Protocol");
        }
        else if (protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }
        String ext=url.substring(url.lastIndexOf(".")+1);
        if(ext.equals("com")){
            System.out.println("Commercial");
        }
        else if(ext.equals("org"))
            System.out.println("Organisation");
        else if (ext.equals("net")){
            System.out.println("network");
        }
        else if(ext.equals("gov")){
            System.out.println("Government");
        }

    }
}