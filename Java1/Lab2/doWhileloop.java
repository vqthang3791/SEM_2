package Java1.Lab2;

public class doWhileloop {
    public static void main(String[] args) {

        int num = 1, sum = 0;

        do {
            sum = sum + num;
            num++;
        } while (num <= 10);
        System.out.printf("Sum of 10 number:%d\n", sum);
    }
}
