package Java1.Lab8.Classroom;

public class Rectangle extends Shape {
    float perimeter;
    float length = 10;

    @Override
    void calculate(float width) {
        perimeter = 2 * (length + width);
        System.out.println("Perimeter of the Rectangle is :" + perimeter);
    }
}
