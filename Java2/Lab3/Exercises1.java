package Java2.Lab3;

import java.sql.*;

public class Exercises1 {
    public static void main(String[] args) {
        try (

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");


                Statement stmt = conn.createStatement();

        ) {

            String strSelect = "select * from book";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are: ");
            int rowCount = 0;
            while (rset.next()) {
                int id = rset.getInt("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + ", " + title + ", " + author + ", " + price + ", " + qty);
                rowCount++;
            }
            System.out.println("Total number of record = " + rowCount);

            System.out.println("===========================================================");
            String strSelect1 = "select title, price from book WHERE author = 'Codelean VN'";
            System.out.println("The SQL statement is: " + strSelect1 + "\n");

            ResultSet rset1 = stmt.executeQuery(strSelect1);

            System.out.println("The records selected are: ");
            int rowCount1 = 0;
            while (rset1.next()) {
                String title = rset1.getString("title");
                double price = rset1.getDouble("price");
                System.out.println(title + ", " + price);
                rowCount1++;
            }
            System.out.println("Total number of record = " + rowCount1);


            System.out.println("===========================================================");
            String strSelect2 = "select id, title, author, price, qty from book WHERE author = 'Codelean VN' OR price >= 30 ORDER BY price desc, id ASC";
            System.out.println("The SQL statement is: " + strSelect2 + "\n");

            ResultSet rset2 = stmt.executeQuery(strSelect2);

            System.out.println("The records selected are: ");
            int rowCount2 = 0;
            while (rset2.next()) {
                int id = rset2.getInt("id");
                String title = rset2.getString("title");
                String author = rset2.getString("author");
                double price = rset2.getDouble("price");
                int qty = rset2.getInt("qty");
                System.out.println(id + ", " + title + ", " + author + ", " + price + ", " + qty);
                rowCount2++;
            }
            System.out.println("Total number of record = " + rowCount2);


        } catch (SQLException ex) {
            ex.printStackTrace();
        }//Step5
    }
}