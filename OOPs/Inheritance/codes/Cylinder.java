package OOPs.Inheritance.codes;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius) {
        super(height);
        radius = radius;

    }

}

class Circle {
    private double radius;

    public Circle(double radius) {

        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
