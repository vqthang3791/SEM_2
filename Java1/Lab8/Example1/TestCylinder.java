package Java1.Lab8.Example1;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder: "
                + "radius = " + c1.getRadius()
                + "height = " + c1.getHeight()
                + "base area = " + c1.getArea()
                + "volume = " + c1.getVolume());

//        Cylinder c2 = new Cylinder(10.0);
//        System.out.println("Cylinder: "
//                + "radius = " + c1.getRadius()
//                + "height = " + c1.getHeight()
//                + "base area = " + c1.getArea()
//                + "volume = " + c1.getVolume());

        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder: "
                + "radius = " + c1.getRadius()
                + "height = " + c1.getHeight()
                + "base area = " + c1.getArea()
                + "volume = " + c1.getVolume());
    }
}
