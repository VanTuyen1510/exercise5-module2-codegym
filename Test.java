package Main5;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Diện tích hình tròn là :" + circle.getArea());
        circle.setRadius(3);
        circle.setColor("blue");

        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(5);
        System.out.println("Thể tích hình trụ là " + cylinder.getVolume());

    }
}
