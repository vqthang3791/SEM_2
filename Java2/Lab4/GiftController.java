package Java2.Lab4;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GiftController {
    ArrayList<Gift> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);


    public void selectBook() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "SELECT * FROM books";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                System.out.println(rset.getInt("id") + ", "
                        + rset.getString("name") + ", "
                        + rset.getDouble("price") + ", "
                        + rset.getInt("qty"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void InsertGift(Gift gift) {
        try (
                //Step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                //Step2
                Statement stmt = conn.createStatement();
        ) {

            //Insert a record
            String sqlInsert = "INSERT INTO books VALUE (" + gift.getId() + ", '" + gift.getName() + "', " + gift.getPrice() + ", " + gift.getQty() + ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void DeleteGift(int id) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String sqlDelete = "DELETE FROM books WHERE id = " + id;
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
