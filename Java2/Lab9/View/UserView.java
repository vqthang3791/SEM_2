package Java2.Lab9.View;

import Java2.Lab9.Controllers.RegisterController;
import Java2.Lab9.Models.User;

import java.sql.ResultSet;
import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);
    public String slt;
    public ResultSet rst;
    BookShop bookShop = new BookShop();

    public int checkUser(User user) {
        int y = user.getRole();
        if (y == 1) {
            bookShop.menuCustomer(user);
            return 1;
        } else if (y == 2) {
            bookShop.menuAdmin(user);
            return 2;
        }
        return 0;
    }

    public void createAccount() {
        System.out.println("Enter your account:");
        String name = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        System.out.println("Enter your role: (1-customer, 2-admin)");
        int role = Integer.parseInt(sc.nextLine());
        User obj = new User(name, password, role);
        RegisterController signUp = new RegisterController();
        signUp.signUp(obj);
        bookShop.menuUser();
    }
}

