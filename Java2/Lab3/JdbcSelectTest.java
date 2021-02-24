package Java2.Lab3;

import java.sql.*;

public class JdbcSelectTest {
    public static void main(String[] args) {
        try (
                //step 1
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");

                //step 2
                Statement stmt = conn.createStatement();

        ) {
            //step 3
            String strSelect = "select title, price, qty from book";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            //step 4
            System.out.println("The records selected are: ");
            int rowCount = 0;
            while (rset.next()) {
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty);
                rowCount++;
            }
            System.out.println("Total number of record = " + rowCount);


        } catch (SQLException ex) {
            ex.printStackTrace();
        }//Step5
    }
}

