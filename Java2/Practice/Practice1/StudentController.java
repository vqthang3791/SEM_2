package Java2.Practice.Practice1;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    Scanner sc = new Scanner(System.in);

    public void add(ArrayList<student> arr) {
        System.out.println("Nhập dữ liệu");
        String addNext;
        //1. Add student records
        do {
            System.out.printf("Enter ID: ");
            String id = sc.nextLine();

            System.out.printf("Enter Name: ");
            String name = sc.nextLine();

            System.out.printf("Enter Address: ");
            String address = sc.nextLine();

            System.out.printf("Enter Phone: ");
            String phone = sc.next();

            //truyền vào arr list
            arr.add(new student(id, name, address, phone));
            System.out.println("Giá trị đc truyền: " + arr.get(arr.size() - 1));

//            System.out.println("Bạn có muốn nhập tiếp danh sách hay k ? (Y/N)");
            addNext = sc.nextLine();
        } while (addNext.equalsIgnoreCase("y"));
    }

    //2. Display student records
    public void dislay(ArrayList<student> arr) {
        System.out.println("Hiển thị danh sách người dùng chưa lưu: ");

        String id = "StudentID";
        String name = "StudentName";
        String address = "StudentAddress";
        String phone = "StudentPhone";

        for (
                student student : arr
        ) {
            System.out.printf("%-30s%-30s%-30s%-30s\n",
                    student.getId(),
                    student.getName(),
                    student.getAddress(),
                    student.getPhone());
        }
    }

    //3. Save
    public void save(ArrayList<student> arr) throws SQLException {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/students?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                //step 2:
                Statement stmt = conn.createStatement();
        ) {
            try {
                conn.setAutoCommit(false);
                conn.commit();
                int checkAddUpdate = 0;
                for (student student : arr) {
                    String strAddUpdate = "insert into student values('" + student.getId() + "','"
                            + student.getName() + "','"
                            + student.getAddress() + "','"
                            + student.getPhone() + "')";
                    System.out.println("The SQL Insert Statement is: " + strAddUpdate);
                    if (
                            stmt.executeUpdate(strAddUpdate) > 0
                    ) checkAddUpdate++;
                }
                conn.commit();

                System.out.println("Total" + checkAddUpdate + " records are saved");

                // Lấy dữ liệu từ bảng display
                System.out.println("Check inserted records: ");
                String strSelect = "select * from student";
                ResultSet rs = stmt.executeQuery(strSelect);
                ResultSetMetaData rsMD = rs.getMetaData();

                int numCol = rsMD.getColumnCount();
                for (int i = 1; i <= numCol; i++) {
                    System.out.printf("%-30s", rsMD.getColumnName(i));
                }
                System.out.println();

                //kiểm tra điều kiện
                while (rs.next()) {
                    for (int i = 1; i <= numCol; i++) {
                        System.out.printf("%-30s", rs.getString(i));
                    }
                    System.out.println();
                }
                conn.close();
                if (conn.isClosed()) {
                    System.out.println("đã đóng...!");
                }
            } catch (SQLException ex) {
                conn.rollback();
                ex.printStackTrace();
                System.exit(-1);
            }
        }
    }
}
