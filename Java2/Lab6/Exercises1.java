package Java2.Lab6;

import java.sql.*;

public class Exercises1 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();

        ) {
            //Update price 50%
            String strUpdate = "UPDATE book SET price = price * 1.5 WHERE id = 1004";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");

            //Update qty = 0
            String strUpdate1 = "UPDATE book SET qty = 0 WHERE id = 1005";
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated1 = stmt.executeUpdate(strUpdate1);
            System.out.println(countUpdated + " records affected.\n");

            String strSelect = "SELECT * FROM book ";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()) {
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("author") + ", "
                        + rset.getDouble("price")
                        + rset.getInt("qty"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
