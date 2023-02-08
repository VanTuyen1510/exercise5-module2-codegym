package Main5;

public class Cylinder extends Circle {
    public int height;
    public static final double PI = 3.14;


    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public int getHeight(){
        return height;
    }
    public String getColor(){
        return super.color;
    }
    public int getRadius(){
        return super.radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getVolume(){
        return height * super.getArea();
    }


}
