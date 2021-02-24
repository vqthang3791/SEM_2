package Java2.Lab6;

import java.sql.*;

public class JdbcUpdateTest {
    public static void main(String[] args) {
        try (
                //step 1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
                //step 2
        ) {
            //step 3, 4
            String strUpdate = "UPDATE books set price = price * 0.7, qty = qty + 1 where id = 1001";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdate = stmt.executeUpdate(strUpdate);
            System.out.println((countUpdate + " records affected.\n"));


            String strSelect = "select * from books where id = 1001";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("author") + ", "
                        + rset.getString("title") + ", "
                        + rset.getInt("qty"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
