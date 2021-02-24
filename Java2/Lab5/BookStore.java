package Java2.Lab5;

import java.sql.*;

public class BookStore {
    public static void main(String[] args) {
        try (

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");


                Statement stmt = conn.createStatement();

        ) {
//1.HIỂN THỊ 3 ĐƠN HÀNG MỚI TIẾP NHẬN
            System.out.println("============================================================================");
            String strSelect = "SELECT * FROM `Orders` ORDER BY Orders_ID DESC LIMIT 3;";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are: ");
            int rowCount = 0;
            while (rset.next()) {
                int Orders_ID = rset.getInt("Orders_ID");
                String Qty = rset.getString("Qty");
                int Customer_ID = rset.getInt("Customer_ID");
                System.out.println(Orders_ID + ", " + Qty + ", " + Customer_ID);
                rowCount++;
            }
            System.out.println("Total number of record = " + rowCount);

//2.HIỂN THỊ ĐƠN HÀNG THEO MÃ KHÁCH HÀNG
            System.out.println("============================================================================");
            String strSelect1 = "SELECT * FROM Orders WHERE Customer_ID = 201";
            System.out.println("The SQL statement is: " + strSelect1 + "\n");

            ResultSet rset1 = stmt.executeQuery(strSelect1);

            System.out.println("The records selected are: ");
            int rowCount1 = 0;
            while (rset1.next()) {
                int Orders_ID = rset1.getInt("Orders_ID");
                int Qty = rset1.getInt("Qty");
                int Customer_ID = rset1.getInt("Customer_ID");
                System.out.println(Orders_ID + ", " + Qty + ", " + Customer_ID);
                rowCount1++;
            }
            System.out.println("Total number of record = " + rowCount1);

//3.HIỂN THỊ TRẠNG THÁI ĐƠN HÀNG THEO MÃ ĐƠN HÀNG
            System.out.println("============================================================================");
            String strSelect2 = "SELECT * FROM Orders WHERE Orders_ID = 111";
            System.out.println("The SQL statement is: " + strSelect2 + "\n");
            ResultSet rset2 = stmt.executeQuery(strSelect2);
            System.out.println("The records selected are: ");
            int rowCount2 = 0;
            while (rset2.next()) {
                int Orders_ID = rset2.getInt("Orders_ID");
                String Qty = rset2.getString("Qty");
                int ISBN = rset2.getInt("ISBN");
                System.out.println(Orders_ID + ", " + Qty + ", " + ISBN);
                rowCount2++;
            }
            System.out.println("Total number of record = " + rowCount2);

//4.HIỂN THỊ THÔNG TIN CHI TIẾT CỦA MỘT ĐƠN HÀNG  THEO MÃ ĐƠN ĐƯỢC NHẬP VÀO
            System.out.println("============================================================================");
            String strSelect3 = "SELECT * FROM Orders_details WHERE Orders_ID = 111";
            System.out.println("The SQL statement is: " + strSelect3 + "\n");
            ResultSet rset3 = stmt.executeQuery(strSelect3);
            System.out.println("The records selected are: ");
            int rowCount3 = 0;
            while (rset3.next()) {
                int Orders_details = rset3.getInt("Orders_details");
                String Qty = rset3.getString("Qty");

                System.out.println(Orders_details + ", " + Qty);
                rowCount3++;
            }
            System.out.println("Total number of record = " + rowCount3);

//5.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐANG CHỜ XỬ LÝ
            System.out.println("============================================================================");
            String strSelect4 = "SELECT * FROM Orders_details WHERE  Qty = 'Đang xử lý'";
            System.out.println("The SQL statement is: " + strSelect4 + "\n");
            ResultSet rset4 = stmt.executeQuery(strSelect4);
            System.out.println("The records selected are: ");
            int rowCount4 = 0;
            while (rset4.next()) {
                int Orders_details = rset4.getInt("Orders_details");
                String Qty = rset4.getString("Qty");

                System.out.println(Orders_details + ", " + Qty);
                rowCount4++;
            }
            System.out.println("Total number of record = " + rowCount4);

//6.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ ĐÓNG GÓI
            System.out.println("============================================================================");
            String strSelect5 = "SELECT * FROM Orders_details WHERE  Qty = 'Đã đóng gói'";
            System.out.println("The SQL statement is: " + strSelect5 + "\n");
            ResultSet rset5 = stmt.executeQuery(strSelect5);
            System.out.println("The records selected are: ");
            int rowCount5 = 0;
            while (rset5.next()) {
                int Orders_details = rset5.getInt("Orders_details");
                String Qty = rset5.getString("Qty");

                System.out.println(Orders_details + ", " + Qty);
                rowCount5++;
            }
            System.out.println("Total number of record = " + rowCount5);

//7.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ GỬI VẬN CHUYỂN
            System.out.println("============================================================================");
            String strSelect6 = "select * from Orders_details WHERE  publisher = 'Đang giao hàng'";
            System.out.println("The SQL statement is: " + strSelect6 + "\n");
            ResultSet rset6 = stmt.executeQuery(strSelect5);
            System.out.println("The records selected are: ");
            int rowCount6 = 0;
            while (rset6.next()) {
                int Orders_details = rset6.getInt("Orders_details");
                String Qty = rset6.getString("Qty");

                System.out.println(Orders_details + ", " + Qty);
                rowCount6++;
            }
            System.out.println("Total number of record = " + rowCount6);

//8.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ GIAO HÀNG THÀNH CÔNG
            System.out.println("============================================================================");
            String strSelect7 = "select * from orders WHERE  Qty = 'Hoàn thành'";
            System.out.println("The SQL statement is: " + strSelect7 + "\n");
            ResultSet rset7 = stmt.executeQuery(strSelect7);
            System.out.println("The records selected are: ");
            int rowCount7 = 0;
            while (rset7.next()) {
                int Orders_ID = rset7.getInt("Orders_ID");
                String Qty = rset7.getString("Qty");

                System.out.println(Orders_ID + ", " + Qty);
                rowCount7++;
            }
            System.out.println("Total number of record = " + rowCount7);

//9.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ BỊ HỦY
            System.out.println("============================================================================");
            String strSelect9 = "select * from Orders_details WHERE  Qty = 'Hủy'";
            System.out.println("The SQL statement is: " + strSelect9 + "\n");
            ResultSet rset9 = stmt.executeQuery(strSelect9);
            System.out.println("The records selected are: ");
            int rowCount9 = 0;
            while (rset9.next()) {
                int Orders_ID = rset9.getInt("Orders_ID");
                String Qty = rset9.getString("Qty");

                System.out.println(Orders_ID + ", " + Qty);
                rowCount9++;
            }
            System.out.println("Total number of record = " + rowCount9);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }//Step5
    }
}
