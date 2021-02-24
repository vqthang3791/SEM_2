package Java1.Lab9.Example1;

public class Cylinder extends Cricle {
    private double height;

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolumne() {
        return super.getArea() * height;
    }

    public double getArea() {
        return 2.0 * Math.PI * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height + "," + super.toString() +
                '}';
    }
}
