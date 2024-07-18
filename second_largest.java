public class second_largest {
    public static void main(String[] args){
        int[] A={1,5,90,7,63,5,3,2};
        int max2;
        int max1=max2=A[0];
        for(int i=0;i<A.length;i++){
            if(max1<A[i]){
                max2=max1;
                max1=A[i];
            }
            else if(A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println("Second largest element is: "+max2);

    }
}
