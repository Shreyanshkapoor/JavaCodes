class rectangle {
    private double length;
    private double breadth;

    public double getlength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setlength(double l) {
        if (l >= 0)
            length = l;
        else
            length = 0;
    }

    public void setbreadth(double b) {
        if (b >= 0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length == breadth;
    }
}

public class rectangle02 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.setlength(10.5);
        r.setbreadth(5.6);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("It is a square: " + r.isSquare());
    }
}
