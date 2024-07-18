class cyclinder{
    public double radius;
    public double height;

    public double lidarea(){
        return Math.PI*radius*radius;
    }
    public double TSA(){
        return 2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return lidarea()*height;
    }
}
public class cyclinder_Class {
    public static void main(String[] args){
        cyclinder s=new cyclinder();
        s.height=10;
        s.radius=7;
        System.out.println("Lid area is:"+s.lidarea());
        System.out.println("TSA of Cyclinder:"+s.TSA());
        System.out.println("Volume of Cyclinder is:"+s.volume());


    }
}
