package Java1.Lab4;

public class circle {
    private double radius;
    private String color;

    public circle() {
        radius = 1.0;
        color = "red";
    }
    public circle(double r) {
        radius = r;
        color = "red";
    }
    public circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

