package Java1.Lab2;

public class forLoopwithcomma {
    public static void main(String[] args) {

        int i, j, max = 10;
        for (i = 0, j = max; i <= max; i++, j--) {
            System.out.printf("\n%d + %d = %d", i, j, i + j);
        }
    }
}
