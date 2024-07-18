import javax.sound.midi.Track;

class Rectangle{
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean issquare(){
        if(length==breadth)
            return true;
        else
            return false;
    }
}
public class Rectangle_Class {
    public static void main(String[] args){
        Rectangle s=new Rectangle();
        s.length=12;
        s.breadth=12;
        System.out.println("Area is: "+s.area());
        System.out.println("Area is: "+s.perimeter());
        System.out.println("it is square: "+s.issquare());

    }
}
