package Java1.Lab9.Example2;

public class Triangle extends Shape {
    private int base, height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                "," + super.toString() +
                '}';
    }

    public double getAre() {
        return 0.5 * base * height;
    }
}
