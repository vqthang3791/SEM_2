package Java1.Lab8.Classroom;

class Circle extends Shape {
    float area;

    @Override
    void calculate(float rad) {
        area = getPI() * rad * rad;
        System.out.println(area);
    }
}
