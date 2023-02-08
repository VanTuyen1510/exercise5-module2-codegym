package Main5;

public class Circle {
    public int radius;
    public String color;
    public static final double PI = 3.14;



    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(){
        this(2,"red");
    }

    public int getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }


}
