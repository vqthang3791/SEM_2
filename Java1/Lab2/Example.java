package Java1.Lab2;

public class Example {
    public static void main(String[] args) {

        int num = 5, product = 0;

        while (num <= 10) {
            product = num * 10;
            System.out.printf(" %d * 10 = %d", num, product);
            num++;
        }
        System.out.println("out side the loop");
    }
}
