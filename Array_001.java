import java.util.Scanner;

public class Array_001 {
    public static void main(String[] args){
        int key;
        int[] A={1,2,3,4,5,6,9,8};
        System.out.println("Eneter a Key " );
        Scanner sc=new Scanner(System.in);
        key=sc.nextInt();


        for(int i=0;i< A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println("Element Found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");


    }

}
