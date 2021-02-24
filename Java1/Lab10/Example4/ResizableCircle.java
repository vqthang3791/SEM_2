package Java1.Lab10.Example4;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(int percent) {
        radius = radius + radius * percent / 100;
    }
}