class Rectangles{
    private double length;
    private double breadth;

    public Rectangles(){//constructor with no paremeter.
        length=1;
        breadth=1;
    }
    public Rectangles(double l,double b){// constructor with paremeters.
        setLength(l);
        setBreadth(b);
    }
    public Rectangles(double s){// constructor.
        length=breadth=s;
    }

    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
        if(l>0){
            length=l;
        }
        else
            length=0;
    }
    public void setBreadth(double b){
        if(b>0){
             breadth=b;
        }
        else
            breadth=0;
    }
    public double area() {
        return getLength()*getBreadth();
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}
public class Rectangle_03 {
    public static void main(String[] args){
        Rectangles r=new Rectangles(-10,-5);
        System.out.println("Area: "+r.area());

    }
}
