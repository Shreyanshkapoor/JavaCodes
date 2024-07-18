public class max_number {
    static int max(int ...num){
        if(num.length==0)return Integer.MIN_VALUE;
        int max=num[0];
        for(int i=1;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        return max;

    }
    public static void main(String ...args){
        System.out.println(max());
        System.out.println(max(10,20));
        System.out.println(max(20,39,65));
        System.out.println(max(9));



    }

}
