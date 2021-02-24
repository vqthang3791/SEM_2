package Java1.Lab10.Exercise;

public class Rectangle implements Shape1 {
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
