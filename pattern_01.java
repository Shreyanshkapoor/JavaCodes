//public class pattern_01 {
//    public static void main(String[] args){
//        for (int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println(" ");
//        }
//    }
//}


//02--->
//public class pattern_01 {
//    public static void main(String[] args){
//        for (int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println(" ");
//        }
//    }
//}

//03--->
//public class pattern_01 {
//    public static void main(String[] args){
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(i+j+" ");
//
//            }
//            System.out.println(" ");
//        }
//    }
//}


//04--->
//public class pattern_01 {
//    public static void main(String[] args){
//        int n=5;
//        int count=0;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                count++;
//                System.out.format("%02d ",count);
//
//            }
//            System.out.println(" ");
//        }
//    }
//}




//
////05
//public class pattern_01 {
//    public static void main(String[] args){
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//
//            }
//            System.out.println(" ");
//        }
//    }
//}



//
////06
//public class pattern_01 {
//    public static void main(String[] args){
//        int n=5;
//        int count=0;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                count++;
//                System.out.print(count+" ");
//
//            }
//            System.out.println(" ");
//        }
//    }
//}

////07
//public class pattern_01 {
//    public static void main(String[] args){
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*"+" ");
//
//            }
//            System.out.println(" ");
//        }
//    }
//}

//08.01
//public class pattern_01 {
//    public static void main(String[] args){
//        int n=5;
//        for (int i=1;i<=5;i++){
//            for(int j=1;j<=n;j++){
//                System.out.print(j+" ");
//
//            }
//            n--;
//            System.out.println(" ");
//        }
//    }
//}


////08.02
//public class pattern_01 {
//    public static void main(String[] args){
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n-i+1;j++){
//                System.out.print(j+" ");
//
//            }
//            System.out.println(" ");
//        }
//    }
//}

////09
//public class pattern_01 {
//    public static void main(String[] args){
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if (j>=i){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println("");
//        }
//    }
//}


//10
public class pattern_01{
    public static void main(String[] args){
        int n=5,k=0;
        for(int i=1;i<=n;++i,k=0){
            for(int j=1;j<=n-i;++j){
                System.out.print("  ");
            }
            while(k!=2*i-1){
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
