package Java1.Lab1;

public class DisplaySum {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;
        System.out.print("The sum of ");
        System.out.print(num1);
        System.out.print(" and ");
        System.out.print(num2);
        System.out.print(" is ");
        System.out.print(sum);
        System.out.print(".");
        int num3 = 2;
        sum = num1 + num2 + num3;
        System.out.println("The sum of " + num1 + ", " + num2 + ", " + num3 + " is " + sum);
    }
}
