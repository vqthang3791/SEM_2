package Java2.Lab7;

import java.sql.*;
import java.util.Scanner;

public class UserView {
    final int SENTINEL = 0;
    int n;
    Scanner scanner = new Scanner(System.in);
    UserController uc = new UserController();

    public static void main(String[] args) {
        UserView views = new UserView();
        views.UsersView();
    }

    public void UsersView() {
        System.out.println("Hello! Wellcome to BookStore T2004M \n");
        UserView views = new UserView();
        views.menu();
        n = scanner.nextInt();
        while (n != SENTINEL) {
            switch (n) {
                case 1:
                    views.signUp();
                    break;
                case 2:
                    views.signIn();
                    return;
            }
            views.menu();
            n = scanner.nextInt();
        }
        System.out.println("Good Bye!....See you again!");
    }


    public void menu() {
        System.out.println("Enter number 1 to register / Enter number 2 to login / Enter number 0 to exit ...!");
        System.out.println("1.Sign Up");
        System.out.println("2.Sign In");
        System.out.println("0.Exit....");
        System.out.println("===============");
        System.out.print("Your choice is: ");
    }

    public void signUp() {
        System.out.print("Enter name: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        System.out.print("Enter role: ");
        String role = scanner.next();

        Users users = new Users(username, password, role);
        uc.InsertUsers(users);
        uc.SelectUsers();
        System.out.println("\n");
    }

    public void signIn() {
        UserView views = new UserView();
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            System.out.print("Enter users: ");
            String user = scanner.next();
            System.out.print("Enter pass: ");
            String pass = scanner.next();
            String sqlSelect = "SELECT * FROM Users WHERE username = " + "'"
                    + user + "'"
                    + "AND password = " + "'" + pass + "'";
            ResultSet rset = stmt.executeQuery(sqlSelect);
            if (rset.next()) {
                System.out.println("Logged in successfully");
                views.menuLogIn();
                n = scanner.nextInt();
                while (n != SENTINEL) {
                    switch (n) {
                        case 1:
                            views.ManageBook();
                        case 2:
                            views.ManageCustomers();
                    }
                    System.out.println("\n");
                    views.menuLogIn();
                    n = scanner.nextInt();
                }
            } else {
                System.out.println("Login unsuccessful");
                System.out.println("\n");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void ManageBook() {
        UserView views = new UserView();
        views.menuBooks();
        int x;
        x = scanner.nextInt();
        while (x != SENTINEL) {
            switch (x) {
                case 1:
                    System.out.print("Nhập thông tin sản phẩm" + "\n");
                    views.addBooks();
                    break;
                case 2:
                    System.out.print("Sửa sản phẩm" + "\n");
                    views.updateBooks();
                    break;
                case 3:
                    System.out.print("Xóa sản phẩm" + "\n");
                    views.deleteBooks();
                    break;
                case 4:
                    System.out.print("Kiểm tra sản phẩm" + "\n");
                    uc.SelectBooks();
                    break;
            }
            views.menuBooks();
            x = scanner.nextInt();
        }
    }

    public void ManageCustomers() {
        UserView views = new UserView();
        views.menuCustomers();
        int y;
        y = scanner.nextInt();
        while (y != SENTINEL) {
            switch (y) {
                case 1:
                    System.out.print("Nhập thông tin khách hàng" + "\n");
                    views.addCustomers();
                    break;
                case 2:
                    System.out.print("Sửa thông tin khách hàng" + "\n");
                    views.updateCustomers();
                    break;
                case 3:
                    System.out.print("Xóa khách hàng" + "\n");
                    views.deleteCustomers();
                    break;
                case 4:
                    System.out.print("Kiểm tra danh sách khách hàng" + "\n");
                    uc.SelectCustomers();
                    break;
            }
            views.menuCustomers();
            y = scanner.nextInt();
        }
    }

    //Customer
    public void menuCustomers() {
        System.out.println("0.Quay lại");
        System.out.println("1.Thêm khách hàng");
        System.out.println("2.Sửa khách hàng");
        System.out.println("3.Xóa khách hàng");
        System.out.println("4.Hiển thị khách hàng");
        System.out.println("=======================");
        System.out.print("Sự lựa chọn của bạn là: ");
    }

    public void addCustomers() {
        System.out.print("Enter Customer ID: ");
        int Customer_ID = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Customer Name: ");
        String Customer_Name = scanner.nextLine();

        System.out.print("Enter Customer Email: ");
        String Email = scanner.nextLine();

        System.out.print("Enter Customer Phone: ");
        String Phone = scanner.nextLine();

        System.out.print("Enter Customer Address: ");
        String Address = scanner.nextLine();

        System.out.print("Enter Customer Lever: ");
        String lever = scanner.nextLine();

        Customers ct = new Customers(Customer_ID, Customer_Name, Email, Phone, Address, lever);
        uc.InsertCustomers(ct);
    }

    public void deleteCustomers() {
        System.out.print("Enter Customer ID: ");
        int Customer_ID = scanner.nextInt();
        uc.DeleteCustomers(Customer_ID);
    }

    public void updateCustomers() {
        System.out.print("Enter Customer ID: ");
        int Customer_ID = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String Customer_Name = scanner.nextLine();

        System.out.print("Enter Customer Phone: ");
        String Phone = scanner.nextLine();

        System.out.println("Enter Customer Email: ");
        String Email = scanner.nextLine();

        System.out.print("Enter Customer Address: ");
        String Address = scanner.nextLine();

        System.out.println("Enter Customer Lever: ");
        String lever = scanner.nextLine();

        uc.UpdateCustomers(Customer_ID, Customer_Name, Email, Phone, Address, lever);
    }

    //LogAccount
    public void menuLogIn() {
        System.out.println("1.Quản lí sản phẩm");
        System.out.println("2.Quản lí khách hàng");
        System.out.println("=======================");
        System.out.print("Sự lựa chọn của bạn là: ");
    }

    //Books
    public void menuBooks() {
        System.out.println("0.Quay lại");
        System.out.println("1.Thêm sản phẩm");
        System.out.println("2.Sửa sản phẩm");
        System.out.println("3.Xóa sản phẩm");
        System.out.println("4.Hiển thị sản phẩm");
        System.out.println("=======================");
        System.out.print("Sự lựa chọn của bạn là: ");
    }


    public void addBooks() {

        System.out.print("Enter ISBN: ");
        int ISBN = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter Book Name: ");
        String Book_Name = scanner.nextLine();
//        Integer Book_Name = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter Book Title: ");
        String Title = scanner.nextLine();

        System.out.print("Enter Book Author: ");
        String Author = scanner.nextLine();


        System.out.print("Enter Quantity: ");
        int Qty = scanner.nextInt();

        System.out.print("Enter Price: ");
        double Price = scanner.nextDouble();

        Books books = new Books(ISBN, Book_Name, Title, Author, Qty, Price);
        uc.InsertBooks(books);
    }

    public void deleteBooks() {
        System.out.print("Enter ISBN: ");
        int ISBN = scanner.nextInt();
        uc.DeleteBooks(ISBN);
    }

    public void updateBooks() {
        System.out.print("Enter ISBN: ");
        int ISBN = scanner.nextInt();

        System.out.print("Enter Quantity: ");
        int Qty = scanner.nextInt();

        System.out.print("Enter Price: ");
        double Price = scanner.nextDouble();

        uc.UpdateBooks(ISBN, Qty, Price);
    }
}
