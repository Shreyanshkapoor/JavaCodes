public class HCF_fac {
    int HCF_num(int n,int m){
        while(n!=m){
            if(n>m){
                n=n-m;
            }
            else{
                m=m-n;
            }
        }
        return m;
    }
    public static void main(String[] args){
        HCF_fac x=new HCF_fac();
        System.out.println(x.HCF_num(35,56));
    }
}
