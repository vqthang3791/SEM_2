package Java2.Lab7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Users {
    private String username;
    private String password;
    private String role;

    public Users(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        Scanner sc = new Scanner(System.in);
        String username = "";
        while (true) {
            System.out.println("Enter User: ");
            username = sc.nextLine();
            Pattern pUser = Pattern.compile("^[0-9A-Za-z]{6,12}$");
            if (pUser.matcher(username).find()) {
                break;
            } else {
                System.err.println("invaild account, Nhập 8 đến 12 ký tự.");
            }
        }
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        Scanner sc = new Scanner(System.in);
        String password = "";
        while (true) {
            System.out.println("Enter Pass: ");
            password = sc.nextLine();
            Pattern p = Pattern.compile("^[A-Z]+[0-9A-Za-z]{8,31}$");
            if (p.matcher(password).find()) {
                break;
            } else {
                System.err.println("invaild pass, Nhập đủ 8 > 31 ký tự, chữ cái đầu tiên viết hoa.");
            }
        }
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

