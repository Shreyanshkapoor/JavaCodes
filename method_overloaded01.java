public class method_overloaded01 {
    static float area(float length,float breath){
        float A=length*breath;
        return A;
    }
    static float area(float r){
        float A=(22/7)*r*r;
        return A;

    }
    public static void main(String[] args){
        System.out.println(area(22,3));
        System.out.println(area(4));

    }
}
