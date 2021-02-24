package Java1.Lab9.Example1;

public class Cricle {
    private double radius;

    public Cricle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

