package Java2.Lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exercises2 {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");

                PreparedStatement pstmt = conn.prepareStatement(
                        "INSERT INTO books(ISBN, Book_Name, Title, Author, Qty, Price) VALUES (?, ?, ?, ?, ?, ? )");
                PreparedStatement pstmt1 = conn.prepareStatement(
                        "UPDATE Books SET Price = ? WHERE ISBN = ?");
                PreparedStatement pstmt2 = conn.prepareStatement(
                        "DELETE FROM Books WHERE ISBN = ? ");
        ) {
            conn.setAutoCommit(false);
            pstmt.setString(1, " Code ABC");
            pstmt.setDouble(2, 20);
            pstmt.setInt(3, 1);
            pstmt.addBatch();

            pstmt1.setDouble(1, 100);
            pstmt1.setInt(2, 11);
            pstmt1.executeUpdate();

            pstmt2.setInt(1, 19);
            pstmt2.executeUpdate();

            int[] returnCodes = pstmt2.executeBatch();
            System.out.println("Return codes are: ");
            for (int code : returnCodes) System.out.println(code + ", ");
            System.out.println();
            conn.commit();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

