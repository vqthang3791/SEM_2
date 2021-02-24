package Java2.Lab7;

import java.sql.*;
import java.util.Scanner;

public class UserController {
    Scanner scanner = new Scanner(System.in);


    public void SelectBooks() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ) {

            System.out.println("============================================================================");
            String strSelect = "SELECT * FROM Books";
            System.out.println("The SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("The records selected are: ");

            while (rset.next()) {
                int ISBN = rset.getInt("ISBN");
                String Book_Name = rset.getString("Book_Name");
                String Title = rset.getString("Title");
                String Author = rset.getString("Author");
                double Price = rset.getDouble("Price");
                int Qty = rset.getInt("Qty");

                System.out.println(ISBN + ", "
                        + Book_Name + ", "
                        + Title + ", "
                        + Author + ", "
                        + Qty + ", "
                        + Price);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void InsertBooks(Books books) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                //Step2
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "INSERT INTO Books (ISBN, Book_Name, Title, Author, Qty, Price) VALUES ("
                    + books.getISBN() + ", '"
                    + books.getBook_Name() + "', ' "
                    + books.getTitle() + "', ' "
                    + books.getAuthor() + "', "
                    + books.getQty() + ", "
                    + books.getPrice() + ")";

            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void DeleteBooks(int ISBN) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");

                Statement stmt = conn.createStatement();
        ) {
            String sqlDelete = "DELETE FROM Books WHERE ISBN = " + ISBN;
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void UpdateBooks(int ISBN, int Qty, double Price) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "UPDATE Books SET Price ="
                    + Price +
                    ", Qty =" + Qty +
                    " WHERE ISBN = " + ISBN;
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void SelectUsers() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "SELECT * FROM Users";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                System.out.println(rset.getString("username") + ", "
                        + rset.getString("password") + ", "
                        + rset.getString("role"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void InsertUsers(Users user) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into users (username,password,role) values (" + "'"
                    + user.getUsername() + "', '"
                    + user.getPassword() + "', "
                    + user.getRole() + ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    //Customer
    public void SelectCustomers() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "SELECT * FROM Customers";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);

            while (rset.next()) {
                System.out.println(rset.getInt("Customer_ID") + ", "
                        + rset.getString("Customer_Name") + ", "
                        + rset.getString("Email") + ", "
                        + rset.getString("Phone") + ", "
                        + rset.getString("Address") + ", "
                        + rset.getString("lever"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void InsertCustomers(Customers ct) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "INSERT INTO Customers (Customer_ID, Customer_Name, Email, Phone, Address, lever) VALUES ("
                    + ct.getCustomer_ID() + ", '"
                    + ct.getCustomer_Name() + "', '"
                    + ct.getEmail() + "', '"
                    + ct.getPhone() + "', '"
                    + ct.getAddress() + "', '"
                    + ct.getLever() + "' "
                    + ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void DeleteCustomers(int Customer_ID) {
        UserView views = new UserView();
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {

            String sqlSelect = "SELECT * FROM Orders where Customer_ID = " + "'" + Customer_ID + "'";
            ResultSet rset = stmt.executeQuery(sqlSelect);
            if (rset.next()) {
                System.out.println("Tồn tại trong đơn hàng");
            } else {
                String sqlDelete = "DELETE FROM Customers WHERE Customer_ID = " + Customer_ID;
                System.out.println("The SQL statement is: " + sqlDelete + "\n");
                int countDeleted = stmt.executeUpdate(sqlDelete);
                System.out.println(countDeleted + " records deleted.\n");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    public void UpdateCustomers(int Customer_ID, String Customer_Name, String Email, String Phone, String Address, String lever) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "UPDATE Customers SET  "
                    + "Customer_ID =" + "'" + Customer_ID + "'"
                    + ",Customer_Name =" + "'" + Customer_Name + "'"
                    + ",Email =" + "'" + Email + "'"
                    + ",Phone =" + "'" + Phone + "'"
                    + ",Address =" + "'" + Address + "'"
                    + ",lever =" + "'" + lever + "'"
                    + " WHERE Customer_ID = " + Customer_ID;
            System.out.println("The SQL statement is: " + strUpdate + "\n");
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + " records affected.\n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
