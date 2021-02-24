package Java1.Lab1;

import java.util.Scanner;

public class FormatedInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int intValue = sc.nextInt();

        System.out.println("Enter a demical number:");
        float floatValue = sc.nextFloat();

        System.out.println("Enter a string value:");
        String strValue = sc.next();

        System.out.println("Value entered are:");

        System.out.println(intValue + " " + floatValue + " " + strValue);
    }
}
