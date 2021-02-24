package Java1.Lab4;

public class Testcircle2 {
    public static void main(String[] args) {

        Circle2 c1 = new Circle2();

        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());


        Circle2 c2 = new Circle2(2.0);
        // Invoke public methods on instance c2, via dot operator.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
    }
}
