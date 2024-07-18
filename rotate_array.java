//public class rotate_array {
//    public static void main(String[] args){
//        int[] A={1,25,6,9,3,44,65,8};
//        for(int x:A) {
//            System.out.print(x + ",");
//        }
//        System.out.println("");
//        int temp=A[0];
//        for(int i=1;i<A.length;i++){
//            A[i-1]=A[i];
//        }
//        A[A.length-1]=temp;
//        for(int x:A){
//            System.out.print(x+",");
//        }
//        System.out.println("");
//    }
//}

//
//public class rotate_array{
//    public static void main(String[] args){
//        int[] A={1,25,6,9,8,55,23};
//        for(int x:A){
//            System.out.print(x+",");
//        }
//        int L=A.length;
//        int temp=A[L-1];
//
//        for(int i=L-2;i>=0;i--){
//            A[i+1]=A[i];
//        }
//        A[0]=temp;
//        System.out.println("\nAfter Right Shifted:");
//        for(int x:A){
//            System.out.print(x+",");
//
//        }
//    }
//}