package Java2.Lab4;

import java.util.Scanner;

class Giftshop {
    final int SENTINEL = 0;
    int n;
    Scanner scanner = new Scanner(System.in);
    GiftController controller = new GiftController();

    public static void main(String[] args) {
        Giftshop gs = new Giftshop();
        gs.ViewShop();
    }


    public void menu() {
        System.out.println("==========================================================================");
        System.out.println("1 - Hiển thị toàn bộ danh sách có trong thư việc");
        System.out.println("2 - Nhập thông tin sách và insert");
        System.out.println("3 - Nhập id sách muốn xóa và delete ");
    }


    public void addBook() {
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        name = scanner.nextLine();
        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter qty: ");
        int qty = scanner.nextInt();
        Gift gift = new Gift(id, name, price, qty);
        controller.InsertGift(gift);
    }

    public void deleteBook() {
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        controller.DeleteGift(id);
    }

    public void ViewShop() {
        System.out.println("Going shop...");
        Giftshop gs = new Giftshop();
        gs.menu();
        n = scanner.nextInt();
        while (n != SENTINEL) {
            switch (n) {
                case 1:
                    System.out.println("Book List");
                    controller.selectBook();
                    break;
                case 2:
                    gs.addBook();
                    break;
                case 3:
                    gs.deleteBook();
                    break;
            }
            gs.menu();
            n = scanner.nextInt();
        }
        System.out.println("Good Bye !....See you again!");
    }
}

