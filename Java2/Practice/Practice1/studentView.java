package Java2.Practice.Practice1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class studentView {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> students = new ArrayList<>();
        StudentController studentController = new StudentController();
        int choice;
        System.out.println("chào mừng a e !");
        do {
            System.out.println("=================");
            System.out.println("Menu: ");
            System.out.println("1. Thêm hồ sơ sinh viên");
            System.out.println("2. Xem danh sách hồ sơ sinh viên khi chưa lưu");
            System.out.println("3. Lưu danh sách hồ sơ sinh viên");
            System.out.println("4. Thoát chương trình");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    studentController.add(students);
                    break;
                case 2:
                    studentController.dislay(students);
                    break;
                case 3:
                    studentController.save(students);
                    break;
                case 4:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("bye bye e nhật! chúc e nhật học lại may mắn:(");
            }
        } while (choice != 4);
    }
}
