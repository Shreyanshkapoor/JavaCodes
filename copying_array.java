import javax.swing.text.html.StyleSheet;

public class copying_array {
   public static void main(String[] args){
       int[] A={8,6,10,9,2,15,7,13,14,11};
       int[] B=new int[10];
       for(int i=0;i<A.length;i++){
           B[i]=A[i];
           System.out.print(B[i]+",");
       }
       System.out.println(" ");
//        for(int i=0;i<10;i++){
//            System.out.print(A[i]+",");
//        }
   }

}



// Reverse copying in array
public class copying_array{
   public static void main(String[] args){
       int[] A={8,6,10,9,2,15,7,13,14,11};
       int[] B=new int[10];
       for(int i=A.length-1,j=0;i>=0;i--,j++){
           B[j]=A[i];
       }
       for(int x:B){
           System.out.print(x+",");
       }

   }
}

// // increase the array.
// public class copying_array{
//     public static void main(String[] args){
//          int[] A={8,6,10,9,2};
//          int[] B=new int[2*A.length];
//          System.out.println("length before modification of A:"+A.length);
//          for (int i=0;i<A.length;i++){
//              B[i]=A[i];
//              System.out.print(B[i]+",");
//          }
//          System.out.println(" ");
//          A=B;
//          B=null;
//          System.out.println("Length after modifiction of A :"+A.length);



//     }
}

