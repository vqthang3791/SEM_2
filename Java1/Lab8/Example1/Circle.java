package Java1.Lab8.Example1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Circle()");
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
        System.out.println("Circle(radius)");
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = "red";
        System.out.println("Circle(radius, color)");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
