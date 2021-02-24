package Java1.Lab2;

public class testLabeledBreak {
    public static void main(String[] args) {
        int i;

        outer:
        for (i = 0; i <= 5; i++) {
            if (i == 2) {
                System.out.println("Hello");
                break outer;
            }

        }
        System.out.println("this is outer of loop");
    }
}
