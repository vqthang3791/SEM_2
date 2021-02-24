package Java1.Lab4;

class Circle2 {
    private double radius;
    private String color;

    public Circle2() {
        radius = 1.0;
        color = "red";
    }

    public Circle2(double r) {
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    public static void main(String[] args) {
        Circle2 c2 = new Circle2(1.2);
        System.out.println(c2.toString());
        System.out.println(c2);
        System.out.println("Operator '+' invokes toString() too: " + c2);
    }
}
