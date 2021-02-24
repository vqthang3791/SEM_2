package Java1.Lab4;

public class TestCircle {
    public static void main(String[] args) {   // Program entry point

        circle c1 = new circle(2.0, "blue");  // Use 3rd constructor
        System.out.println("The radius is: " + c1.getRadius());  // use dot operator to invoke member methods
        System.out.println("The color is: " + c1.getColor());
        System.out.printf("The area is: %.2f%n", c1.getArea());

        circle c2 = new circle(2.0);  // Use 2nd constructor
        System.out.println("The radius is: " + c2.getRadius());
        System.out.println("The color is: " + c2.getColor());
        System.out.printf("The area is: %.2f%n", c2.getArea());

        circle c3 = new circle();  // Use 1st constructor
        System.out.println("The radius is: " + c3.getRadius());
        System.out.println("The color is: " + c3.getColor());
        System.out.printf("The area is: %.2f%n", c3.getArea());
    }
}
