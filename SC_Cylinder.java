class Cyclinder_ {
    private int radius;
    private int height;

    public Cyclinder_(){
        radius=1;
        height=1;
    }
    public Cyclinder_(int r,int h){
       radius=r;
       height=h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int r){
        if(r>0)
            radius=r;
        else
            radius=0;
    }
    public void setHeight(int h){
        if (h>=0){
            height=h;
        }
        else{
            height=0;
        }
    }
    public void setDimension(int r,int h){
        height=h;
        radius=r;
    }

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    public double volume()
    {
        return lidArea()*height;
    }
}

public class SC_Cylinder {
    public static void main(String[] args){
        Cyclinder_ c=new Cyclinder_();
        c.setRadius(-10);
        c.setHeight(-4);
        c.setDimension(-10,-4);

        System.out.println("LidArea "+c.lidArea());
        System.out.println("Circumference "+c.perimeter());
        System.out.println("totalSurfaceArea "+c.drumArea());
        System.out.println("Volume "+c.volume());
        System.out.println("Height"+c.getHeight());
        System.out.println("Radius"+c.getRadius());


    }
}


