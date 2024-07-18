public class delete_element {
    public static void main(String[] args){
        int[] A=new int[10];
        A[0]=1;A[1]=21;A[2]=40;A[3]=96;A[4]=56;A[5]=101;
        int n=6;
        for(int i=0;i<n;i++){
            System.out.print(A[i]+",");
        }
        System.out.println(" ");
        int index=3;
        for(int i=index;i<n;i++){
            A[i]=A[i+1];
        }
        System.out.println("After Deletion-->");
        for(int i=0;i<n-1;i++){
            System.out.print(A[i]+",");
        }
        System.out.println(" ");

    }

}
